package ng.com.anikecosmetics.controller;

import android.net.Uri;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.ArrayList;
import java.util.List;

import ng.com.anikecosmetics.model.Product;

public class FirebaseHelper {

    public FirebaseHelperMethods firebaseHelperMethods;

    public static final String PRODUCT_COLLECTION = "products";
    public static final String IMAGE_UPLOAD = "image-upload";
    public static final String PRODUCT_UPLOAD = "product-upload";

    public FirebaseHelper(FirebaseHelperMethods firebaseHelperMethods) {
        this.firebaseHelperMethods = firebaseHelperMethods;
    }

    public FirebaseFirestore getFireStoreInstance(){
        return FirebaseFirestore.getInstance();
    }

//    private void getProductsFromDatabase(){
//        getFireStoreInstance().collection(PRODUCT_COLLECTION).get()
//                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
//                    @Override
//                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//                        List<Product> productList = new ArrayList<>();
//                        for (DocumentSnapshot document : queryDocumentSnapshots.getDocuments()) {
//                            productList.add(document.toObject(Product.class));
//                        }
//
//                        firebaseHelperMethods.productsLoaded(productList);
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                      firebaseHelperMethods.onFailure(FirebaseType.GET_PRODUCT, e.getMessage());
//                    }
//                });
//    }

    public Task<Void> addToDatabase(Product product){
//        Task<DocumentReference> addProduct = FirebaseFirestore.getInstance().collection(PRODUCT_COLLECTION).document(product.getId()).set(product);
        Task<Void> addProduct = FirebaseFirestore.getInstance().collection(PRODUCT_COLLECTION).document(product.getId()).set(product);

        addProduct.addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                firebaseHelperMethods.onSuccessfulProductUpload(product.getId(), product);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                firebaseHelperMethods.onFailure(FirebaseType.PRODUCT_UPLOAD, e.getMessage());

            }
        });


//        using .add()
//        addProduct.addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//                    @Override
//                    public void onSuccess(DocumentReference documentReference) {
//                        firebaseHelperMethods.onSuccessfulProductUpload(documentReference.getId(), product);
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        firebaseHelperMethods.onFailure(FirebaseType.PRODUCT_UPLOAD, e.getMessage());
//                    }
//                });
        return addProduct;
    }

    public void addImageUrlToDb(String imageUri, String productId){
        DocumentReference reference = FirebaseFirestore.getInstance().collection(PRODUCT_COLLECTION).document(productId);

        reference.update("imageUrl", imageUri)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        firebaseHelperMethods.doneUploadingProduct();
                    }
                });
    }

    public FirebaseStorage getStorageInstance(){
        return FirebaseStorage.getInstance();
    }

    public void uploadImageToStorage(String productId, String productName, byte[] image){
        String path = "products/" + productId + "/" + productId + ".png";
        StorageReference imageStorageReference = getStorageInstance().getReference(path);
        StorageMetadata metadata = new StorageMetadata.Builder()
                .setCustomMetadata("ProductName", productName).build();

        UploadTask uploadTask = imageStorageReference.putBytes(image, metadata);
        uploadTask.addOnFailureListener(e -> firebaseHelperMethods.onFailure(FirebaseType.IMAGE_UPLOAD, e.getMessage()));
//        uploadTask.addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
//                Task<Uri> downloadUrl = imageStorageReference.getDownloadUrl();
//            }
//        });
//        return uploadTask;

        Task<Uri> getDownloadableUri = uploadTask.continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
            @Override
            public Task<Uri> then(@NonNull Task<UploadTask.TaskSnapshot> task) throws Exception {
                if(!task.isSuccessful()){
                }
                return imageStorageReference.getDownloadUrl();
            }
        });

        getDownloadableUri.addOnCompleteListener(new OnCompleteListener<Uri>() {
            @Override
            public void onComplete(@NonNull Task<Uri> task) {
                Uri downloadUri = task.getResult();
                firebaseHelperMethods.imageUploadComplete(downloadUri.toString(), productId);
            }
        }).addOnFailureListener(e -> {
            firebaseHelperMethods.onFailure(FirebaseType.IMAGE_UPLOAD, e.getMessage());
        });

    }

    public interface FirebaseHelperMethods{
//        void imageUploadComplete(Uri imageUri);
        void onSuccess(FirebaseHelper.FirebaseType type);
        void onSuccessfulProductUpload(String documentId, Product product);
        void imageUploadComplete(String imageUri, String documentId);
        void onFailure(FirebaseHelper.FirebaseType type, String message);

        void doneUploadingProduct();

        void productsLoaded(List<Product> productList);
    }

    public enum FirebaseType{
        IMAGE_UPLOAD, PRODUCT_UPLOAD, GET_PRODUCT;
    }
}
