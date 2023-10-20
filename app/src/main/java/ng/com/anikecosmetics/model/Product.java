package ng.com.anikecosmetics.model;

import java.util.Date;

public class Product {
    private String imageUrl;
    private String name;
    private String price;
    private String id;
    private String saleStartDate;
    private String saleEndDate;
    private String salePrice;
    private String status;
    private String url;
    private String brand;

    private int unitsAvailable;

    String description;
    String shortDescription;
    /*

    {"SuccessResponse":{"Head":{"RequestId":"","RequestAction":"GetProducts","ResponseType":"Products","Timestamp":"2023-09-30T13:20:05+0100"},
    "Body":
        {"Products":
            {
                "Product":
                    [
                        {"SellerSku":"001","ShopSku":"DR093ST41S6ERNAFAMZ-395383898","Name":"DR. Rashel Vitamin C Face Serum","Variation":"...","ParentSku":"001","Quantity":"4","Available":"4","Price":"2500","SalePrice":"","SaleStartDate":"","SaleEndDate":"","Status":"inactive","ProductId":"6971764151953","Url":"http:\/\/www.jumia.com.ng\/259985844.html","MainImage":"https:\/\/ng.jumia.is\/rFmjqERDwPT6r-GeOh3vfHCInUY=\/fit-in\/500x500\/filters:fill(white)\/product\/44\/8589952\/1.jpg?8600","Images":{"Image":["https:\/\/ng.jumia.is\/rFmjqERDwPT6r-GeOh3vfHCInUY=\/fit-in\/500x500\/filters:fill(white)\/product\/44\/8589952\/1.jpg?8600","https:\/\/ng.jumia.is\/xb57FkM2C7d7RxjoOhmG_yd4l-4=\/fit-in\/500x500\/filters:fill(white)\/product\/44\/8589952\/2.jpg?8600"]},"Description":"<div>DR\u00b7RASHEL Vitamin C Face Serum is a breakthrough skincare solution, meticulously crafted for remarkable results. This ultra-light serum offers a multitude of benefits for your skin, making it a must-have in your daily routine.<\/div><div><br \/><\/div><div>It is a powerful a vitamin c toner that helps protect your skin from antioxidants, free radicals.<\/div><div><br \/><\/div><div><div>Skin Rejuvenation: Our serum is packed with the potent goodness of Vitamin C, renowned for its ability to fade sunspots and correct discolorations, revealing a more even-toned complexion.<\/div><div><br \/><\/div><div>Texture Refinement: Experience smoother, refined skin texture as the serum reduces the formation of wrinkles and minimizes the appearance of existing ones.<\/div><div><br \/><\/div><div>Hydration and Protection: Enriched with a high concentration of pure vegan hyaluronic acid, it deeply hydrates and plumps skin cells, safeguarding against moisture loss and restoring vitality.<\/div><div><br \/><\/div><div>Youthful Radiance: Unlock a youthful glow as the serum brightens and revitalizes your skin, leaving you with a radiant, age-defying complexion.<\/div><div><br \/><\/div><div>Antioxidant Powerhouse: Powerful antioxidants within the formula neutralize free radicals, counteracting sun damage, and gradually fading sunspots and discoloration.<\/div><\/div>","TaxClass":"default","Brand":"Dr. Rashel","PrimaryCategory":"BB Creams","PrimaryCategoryId":"1024357","ProductData":{"Model":"vitamin c brightening & anti-aging face serum","Color":"Orange","ProductLine":"Anike Cosmetics","ShopType":"Jumia Mall","ColorFamily":"Orange","MainMaterial":"N\/A","Fda":"N\/A","ShortDescription":"<div>Advanced Skin Renewal: This serum harnesses the power of Vitamin C to visibly diminish sunspots, discoloration, and refine your skin's texture for a smoother, more youthful appearance.<\/div><div><br \/><\/div><div>Youthful Radiance: Experience a radiant complexion as this serum brightens your skin, leaving it looking revitalized and glowing with health.<\/div><div><br \/><\/div><div>Wrinkle Reduction: Say goodbye to wrinkles and fine lines. This serum helps reduce their appearance and prevents new ones from forming.<\/div><div><br \/><\/div><div>Deep Hydration: Infused with pure vegan hyaluronic acid, it deeply hydrates your skin, plumping it up for a fresher and more vibrant look.<\/div><div><br \/><\/div><div>Antioxidant Defense: Powerful antioxidants combat free radicals, preventing and reversing sun damage while fading sunspots and discoloration.<\/div><div><br \/><\/div><div>Easy Application: Simply apply to your face and neck morning and evening after cleansing, and gently massage for enhanced absorption.<\/div><div><br \/><\/div><div>Choose DR\u00b7RASHEL Vitamin C Face Serum for radiant, younger-looking skin that's protected against the signs of aging and sun damage. Elevate your skincare routine today.<\/div><div><br \/><\/div>","PackageContent":"1 bottle of Dr. Rashel Vitamin C","Note":"For external use, keep out of reach of children. Store in a cool and dry place. Avoid direct contact with eyes, if contact occurs, rinse well with water.","ProductWeight":"0.01","Gender":"Unisex","Season":"All Seasons","SkinType":"All skin types","Volume":"100ml","ManufacturerTxt":"Directions: Wash your face. Take the proper amount on your hand and with a gentle flap until absorbing perfectly. Or soak a cotton pad with toner and gently wipe across your face, eyes and neck to cleanse and tone."}},{"SellerSku":"002","ShopSku":"SK132ST4KV9ZMNAFAMZ-396361202","Name":"Skin Doctor SPF 80 UVA + UVB High Protection Hyaluronic Acid","Variation":"...","ParentSku":"002","Quantity":"6","Available":"6","Price":"3900","SalePrice":"3500","SaleStartDate":"2023-09-16 00:00:00","SaleEndDate":"2024-05-11 00:00:00","Status":"inactive","ProductId":"8858854602909","Url":"http:\/\/www.jumia.com.ng\/260361967.html","MainImage":"https:\/\/ng.jumia.is\/EzcUrXfb4dtWF8FjgrR0d6aIYQI=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/1.jpg?9847","Images":{"Image":["https:\/\/ng.jumia.is\/EzcUrXfb4dtWF8FjgrR0d6aIYQI=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/1.jpg?9847","https:\/\/ng.jumia.is\/b_dh3ByOcUiokxG5efs2bWTeTxk=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/2.jpg?9847","https:\/\/ng.jumia.is\/j8BhAIepiSf4r0qkEToKss8q6no=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/3.jpg?9847","https:\/\/ng.jumia.is\/eUk0sFBtdt4Jx7dfQRl2L6PU-RE=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/4.jpg?9847","https:\/\/ng.jumia.is\/x4pbNXjAvBAwEmQ2s4-AaKfQ_mg=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/5.jpg?9847"]},"Description":"<div>Introducing Skin Doctor SPF 80 UVA + UVB: Your Complete Sun Protection Solution!<\/div><div><br \/><\/div><div>Experience the ultimate in sun protection with Skin Doctor SPF 80 UVA + UVB, a breakthrough face cream designed to shield your skin from the sun's harmful rays while rejuvenating your complexion.<\/div><div><br \/><\/div><div>Our advanced Protection System technology harnesses the power of the latest generation of photostable filters, providing multidimensional protection against both UVA and UVB rays. This cutting-edge formula not only prevents photo-aging but also guarantees long-lasting DNA protection, so your skin can stay youthful and resilient.<\/div><div><br \/><\/div><div>Say goodbye to worries about pigmentation spots; Skin Doctor SPF 80 actively prevents their formation while delivering deep, intensive hydration to nourish your skin from within. The result? A radiant, revitalized complexion that exudes health and vitality.<\/div><div><br \/><\/div><div>What sets Skin Doctor SPF 80 apart is its perfectly absorbing, non-greasy formula. You can trust this cream to provide superior sun protection without leaving any unwanted residue, making it an ideal addition to your daily skincare routine.<\/div><div><br \/><\/div><div>Don't compromise on your skin's health. Elevate your sun protection game with Skin Doctor SPF 80 UVA + UVB and embrace a future of beautifully protected, youthful skin.<\/div>","TaxClass":"default","Brand":"Skin Doctor","PrimaryCategory":"BB Creams","PrimaryCategoryId":"1024357","ProductData":{"Model":"SPF 80 UVA + UVB High Protection with Hyaluronic Acid and Vitamins A,E,F.","ProductLine":"Anike Cosmetics","ShopType":"Jumia Mall","ShortDescription":"<div>1. Unrivaled Sun Protection: Skin Doctor SPF 80 offers unparalleled UVA and UVB protection, safeguarding your skin from the sun's damaging effects. Keep your skin's DNA safe and bid farewell to pigmentation spots.<\/div><div><div><br \/><\/div><div>2. Intense Moisturization: Pamper your skin with deep, lasting hydration. Luxurious formula locks in moisture, leaving your skin feeling supple and revitalized.<\/div><div><br \/><\/div><div>3. Skin-Improving Magic: Skin Doctor SPF 80 doesn't just protect; it also works to enhance your skin's overall condition. Experience the difference as your complexion becomes smoother and more radiant.<\/div><div><br \/><\/div><div>4. Non-Greasy Perfection: Say goodbye to that unwanted oily residue. Our fast-absorbing formula ensures a non-greasy, matte finish, making it perfect for daily use.<\/div><\/div>","PackageContent":"One tube.","Note":"For external use, keep out of reach of children. For sensitive and Allergy prone skin","ProductWeight":"0.01","SkinType":"All skin types","Volume":"125ml","ManufacturerTxt":"Sun protection face cream with high sun filter is designated for care of sensitive and allergy prone skin."}},{"SellerSku":"003","ShopSku":"SK132ST3S6YKUNAFAMZ-402719907","Name":"Skin Doctor Sun 80 SPF UVA+UVB HIGH PROTECTION","Variation":"...","ParentSku":"003","Quantity":"4","Available":"4","Price":"4000","SalePrice":"3800","SaleStartDate":"2023-09-26 00:00:00","SaleEndDate":"2024-03-01 00:00:00","Status":"inactive","ProductId":"8858854602886","Url":"http:\/\/www.jumia.com.ng\/262525782.html","MainImage":"https:\/\/ng.jumia.is\/Ci5SePpbFTJSHZ3d4sxwNlV2kAg=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/1.jpg?0783","Images":{"Image":["https:\/\/ng.jumia.is\/Ci5SePpbFTJSHZ3d4sxwNlV2kAg=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/1.jpg?0783","https:\/\/ng.jumia.is\/_y1LOgXx4vBYrFpVhR079nvMNnQ=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/2.jpg?0783","https:\/\/ng.jumia.is\/uZAWgmWXR-u-92EcYDVrULnmaIo=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/3.jpg?0783","https:\/\/ng.jumia.is\/InrP-rhESJVT8LNlF78Uczq9K04=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/4.jpg?0783","https:\/\/ng.jumia.is\/04g1RWZuRY2DO7rPjKR03ZfJofs=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/5.jpg?0783","https:\/\/ng.jumia.is\/sdjB8O68tpCtoUwoAPveFxtanAI=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/6.jpg?0783"]},"Description":"<div>Skin Doctor Whitening Sun Protection Face Cream - Your Ultimate Defense Against Sun Damage!<\/div><div><br \/><\/div><div>Experience the utmost care and protection for your sensitive and allergy-prone skin with Skin Doctor's Whitening Sun Protection Face Cream. With an impressive SPF 80, this advanced formula is designed to shield your skin from the sun's harmful rays while delivering a host of skincare benefits.<\/div><div><br \/><\/div><div>High Protection System\u2122 Technology: Our cream employs cutting-edge High Protection System\u2122 technology, featuring the latest generation of photostable filters. This technology provides comprehensive protection against both UVA and UVB rays, effectively preventing photo-aging. It goes the extra mile by ensuring long-lasting DNA protection for your skin.<\/div><div><br \/><\/div><div>Say Goodbye to Pigmentation Spots: Bid farewell to unsightly pigmentation spots! Skin Doctor's Whitening Sun Protection Face Cream actively works to prevent their appearance, leaving your skin looking radiant and even-toned.<\/div><div><br \/><\/div><div>Intensive Moisturization: This exceptional formula doesn't just protect; it also hydrates. Dive deep into layers of your skin with its intense moisturization, ensuring a well-nourished and rejuvenated complexion.<\/div><div><br \/><\/div><div>Say yes to glowing, protected skin! Elevate your skincare routine with Skin Doctor's Whitening Sun Protection Face Cream. Don't let the sun steal your skin's radiance; safeguard it with the power of innovation and care. Get your Skin Doctor Whitening Sun Protection Face Cream today, and step into a world of beauty and protection like never before!<\/div>","TaxClass":"default","Brand":"Skin Doctor","PrimaryCategory":"BB Creams","PrimaryCategoryId":"1024357","ProductData":{"Model":"Skind Doctor Sun 80 UVA+UVB with HIGH PROTECTION HYALURONIC ACID and VITAMINS A, E, F. FOR SENSITIVE AND ALLERGY-PRONE","ProductLine":"Anike Cosmetics","ShopType":"Jumia Mall","MainMaterial":"N\/A","ShortDescription":"<ol><li><\/li><li>High SPF 80: Offers superior sun protection for sensitive and allergy-prone skin.<\/li><li>High Protection System\u2122 Technology: Advanced filters guard against UVA\/UVB rays and prevent photo-aging.<\/li><li>Prevents Pigmentation Spots: Say goodbye to uneven skin tone with proactive pigmentation spot prevention.<\/li><li>Intensive Moisturization: Provides deep hydration for nourished, radiant skin.<\/li><li>Long-Lasting DNA Protection: Ensures your skin's DNA remains safeguarded against sun damage.<\/li><li>Ideal for Sensitive Skin: Designed specifically for those with sensitive and allergy-prone skin.<\/li><li>All-in-One Solution: Combines sun protection, hydration, and skin rejuvenation in one cream.<\/li><li>Dermatologically Tested: Clinically proven to be safe and effective for daily use.<\/li><\/ol>","ProductWeight":"0.01","ProductionCountry":"Thailand","Gender":"Unisex","Season":"All Seasons","SkinType":"All skin types","Volume":"150ml","ManufacturerTxt":"<p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">APPLICATION: Apply before and during sun exposure. Reapply many times during a day.<\/p>"}},{"SellerSku":"004","ShopSku":"","Name":"Skin Doctor Sun SPF 60","Variation":"...","ParentSku":"004","Quantity":"4","Available":"4","Price":"4000","SalePrice":"3800","SaleStartDate":"2023-09-26 00:00:00","SaleEndDate":"2024-03-23 00:00:00","Status":"inactive","ProductId":"8858854602879","Url":"","MainImage":"","Images":{"Image":["https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/6\/d\/7\/d\/6d7d63ea2bd9138615ef244f04ab4a02.png","https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/a\/f\/4\/7\/af4777bd50ea6d019e1f09e26bfeafd3.jpeg","https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/e\/9\/1\/7\/e91777d3e24be74f40ee26d25fc1d78f.jpeg","https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/c\/e\/f\/e\/cefe3c32a15fc6d41227ab7cf9412cfc.jpeg","https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/3\/f\/3\/d\/3f3dac7f3952670ed38011db116ec981.jpeg"]},"Description":"<div>Indulge in the luxurious care of Skin Doctor Whitening Sun Protection Face Cream, your path to enjoying fair and flawless skin without the risk of discolorations. This innovative product seamlessly combines the benefits of sun protection with intensive whitening care.<\/div><div><br \/><\/div><div>Our advanced formula features an active whitening complex that not only shields your skin from harmful UV rays but also works diligently to protect your skin's DNA, leaving it fair, radiant, and free from imperfections.&nbsp;<\/div><div><br \/><\/div><div>At the heart of this cream is our proprietary HIGH PROTECT SYSTEM\u2122, a state-of-the-art, photostable sunscreen technology from the latest generation. It goes above and beyond in effectively safeguarding your skin against the damaging effects of both UVA and UVB radiation.<\/div><div><br \/><\/div><div>Experience the confidence that comes with flawless, fair skin. Skin Doctor Whitening Sun Protection Face Cream is your trusted companion for maintaining a luminous complexion while defending against the sun's harmful rays. Revel in the beauty of sun-kissed skin without compromising on protection. Say hello to a brighter, more radiant you!<\/div><div><br \/><\/div><div>Elevate your skincare routine with Skin Doctor today!<\/div>","TaxClass":"default","Brand":"Skin Doctor","PrimaryCategory":"BB Creams","PrimaryCategoryId":"1024357"},{"SellerSku":"005","ShopSku":"BR057ST4PGQY6NAFAMZ-402772306","Name":"Medix 5.5\u2122 Vitamin C Turmeric Firming And Brightening Cream","Variation":"...","ParentSku":"005","Quantity":"6","Available":"6","Price":"16000","SalePrice":"15500","SaleStartDate":"2023-09-26 00:00:00","SaleEndDate":"2024-05-11 00:00:00","Status":"inactive","ProductId":"810400035447","Url":"http:\/\/www.jumia.com.ng\/262563648.html","MainImage":"https:\/\/ng.jumia.is\/yrxHoxDstfJW2qkew9-oM2ZjDI4=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/1.jpg?2182","Images":{"Image":["https:\/\/ng.jumia.is\/yrxHoxDstfJW2qkew9-oM2ZjDI4=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/1.jpg?2182","https:\/\/ng.jumia.is\/BbnDmUFeZHcIioApx7yNBZxjL-Q=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/2.jpg?2182","https:\/\/ng.jumia.is\/HGLHmAM39G68mRsdLdLYVB1PczA=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/3.jpg?2182","https:\/\/ng.jumia.is\/ABidX0CbPI-a4BHX3eKVEgF36ZY=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/4.jpg?2182"]},"Description":"<div>Introducing the Medix 5.5\u2122 Vitamin C + Turmeric Firming and Brightening Cream - your ultimate skincare solution for radiant, youthful, and healthy-looking skin. This powerful cream comes in a sleek package with a mission to transform your daily skincare routine.<\/div><div><br \/><\/div><div>The secret to beautiful skin lies in maintaining a healthy skin barrier with a pH of 5.5, and Medix 5.5\u2122 is here to make it effortless for you. This innovative formula is designed to reduce the appearance of imperfections while fortifying your skin's protective barrier. By doing so, it locks in moisture and shields your skin from harmful pollutants, leaving you with a complexion that's beautifully smooth and firm.<\/div><div><br \/><\/div><div>But that's not all. Medix 5.5\u2122 goes the extra mile by infusing this cream with Vitamin C and Turmeric, known for their brightening and antioxidant properties. This dynamic duo helps restore elasticity, improve the look of dark spots, and leave your skin with a radiant, youthful glow.<\/div><div><br \/><\/div><div>Medix 5.5\u2122 is proud to be vegan and cruelty-free, and it's formulated without harsh ingredients like parabens, drying alcohols, sulfates, and more. Say goodbye to unwanted additives and hello to a cleaner, healthier skincare routine.<\/div><div><br \/><\/div><div>Unlock the potential of your skin with Medix 5.5\u2122 Vitamin C + Turmeric Firming and Brightening Cream. Experience the transformation, and let your natural beauty shine through. Order now and start your journey to radiant, youthful skin!<\/div><div><br \/><\/div><div><br \/><\/div>","TaxClass":"default","Brand":"Medix5 5","PrimaryCategory":"BB Creams","PrimaryCategoryId":"1024357","ProductData":{"Model":"Medix 5.5\u2122 Vitamin C + Turmeric Firming and Brightening Cream","ProductLine":"Anike Cosmetics","ShopType":"Jumia Mall","MainMaterial":"N\/A","ShortDescription":"<div>Key Highlights of Medix 5.5\u2122 Vitamin C + Turmeric Firming and Brightening Cream:<\/div><div><br \/><\/div><div><ol><li>pH 5.5 Skin Barrier Support: Maintain a healthy skin barrier for smoother, firmer, and healthier-looking skin.<\/li><li><br \/><\/li><li>Vitamin C and Turmeric: Infused with brightening Vitamin C and antioxidant-rich Turmeric to improve skin tone and reduce dark spots.<\/li><li><br \/><\/li><li>Vegan and Cruelty-Free: Ethically formulated, ensuring no harm to animals in the process.<\/li><li><br \/><\/li><li>Free from Harmful Ingredients: Contains no parabens, drying alcohols, sulfates, or other harsh additives.<\/li><li><br \/><\/li><li>Ginseng and Vitamin E: These ingredients restore elasticity and promote skin rejuvenation.<\/li><li><br \/><\/li><li>Moisture Lock: Keeps your skin hydrated by sealing in moisture and protecting against pollutants.<\/li><li><br \/><\/li><li>Easy-to-Use Pump: A convenient pump dispenser ensures precise application with every use.<\/li><\/ol><\/div><div><br \/><\/div><div>Transform your skincare routine with Medix 5.5\u2122 - the perfect blend of science and nature for radiant, youthful skin. Upgrade your skincare game today!<\/div><div><br \/><\/div>","ProductWeight":"0.1","ProductionCountry":"United States","Gender":"Unisex","Season":"All Seasons","SkinType":"All skin types","Volume":"400ml","ManufacturerTxt":"<p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">Directions: Massage liberally onto skin dailv, focusing on wrinkles and dark spots.<\/p><p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">Caution: For external use only. If irritation develops discontinue use.<\/p><p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\"><br \/><\/p>"}},{"SellerSku":"006","ShopSku":"CR233ST3ZETIMNAFAMZ-402776928","Name":"CeraVe Daily Moisturizing Lotion","Variation":"...","ParentSku":"006","Quantity":"3","Available":"3","Price":"19000","SalePrice":"18600","SaleStartDate":"2023-09-26 00:00:00","SaleEndDate":"2024-08-01 00:00:00","Status":"inactive","ProductId":"3612621748253","Url":"http:\/\/www.jumia.com.ng\/262567804.html","MainImage":"https:\/\/ng.jumia.is\/HfHGU0mBeZZlzLPY2-B8AFsrRe8=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/1.jpg?4948","Images":{"Image":["https:\/\/ng.jumia.is\/HfHGU0mBeZZlzLPY2-B8AFsrRe8=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/1.jpg?4948","https:\/\/ng.jumia.is\/xlmyb8zPK_RJjF5TZe1Ff3f78Nw=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/2.jpg?4948","https:\/\/ng.jumia.is\/aNUKnkn77HO90AX1gazxO0lam98=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/3.jpg?4948","https:\/\/ng.jumia.is\/B4PTCU3tBFeIBGVtsYM5PIRQKJc=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/4.jpg?4948","https:\/\/ng.jumia.is\/nmzRRFIYooAQJGgYGJBFGCbV6lE=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/5.jpg?4948"]},"Description":"<div>Introducing CeraVe Daily Moisturizing Lotion, your go-to solution for maintaining healthy and hydrated skin. Developed in collaboration with dermatologists, this exceptional lotion is specially formulated for normal to dry skin types, making it a must-have addition to your daily skincare routine.<\/div><div><br \/><\/div><div>What sets CeraVe apart is its unique blend of 3 essential ceramides, which work harmoniously to moisturize and restore your skin's protective barrier. This barrier is crucial in retaining moisture and defending against external factors that can cause dryness and irritation.<\/div><div><br \/><\/div><div>CeraVe employs cutting-edge MVE\u00ae Delivery Technology, ensuring controlled and continuous hydration throughout the day. This means your skin stays nourished and comfortable, without any heaviness or greasiness. The lightweight and oil-free formula make it perfect for daily use, and it won't clog your pores, thanks to its non-comedogenic nature.<\/div><div><br \/><\/div><div>Hyaluronic Acid, another key ingredient, plays a vital role in retaining your skin's natural moisture, leaving it feeling soft, supple, and refreshed. Plus, it's fragrance-free, making it suitable for even the most sensitive skin types and avoiding any potential irritation.<\/div><div><br \/><\/div><div>Gentle, allergy-tested, and non-comedogenic, CeraVe Daily Moisturizing Lotion is designed to pamper your skin and help it stay healthy and hydrated. Unlock the secret to smoother, more comfortable skin and make CeraVe a part of your daily skincare ritual. Trust the dermatologist-developed brand that cares for your skin as much as you do. Order now!<\/div><div><br \/><\/div>","TaxClass":"default","Brand":"Crave","PrimaryCategory":"Lotions","PrimaryCategoryId":"1024319","ProductData":{"Model":"CeraVe DEVELOPED WITH DERMATOLOGISTS Daily Moisturizing Lotion For Normal to Dry Skin","ProductLine":"Anike Cosmetics","ShopType":"Jumia Mall","MainMaterial":"N\/A","ShortDescription":"<div>Key Highlights of CeraVe Daily Moisturizing Lotion:<\/div><div><br \/><\/div><div><ol><li>Developed with Dermatologists: Trusted by skincare experts for its effectiveness and safety.<\/li><li>Essential Ceramides: Formulated with 3 essential ceramides to moisturize and restore the skin barrier.<\/li><li>MVE\u00ae Delivery Technology: Provides all-day hydration through controlled release.<\/li><li>Lightweight & Oil-Free: Perfect for daily use without a heavy or greasy feeling.<\/li><li>Non-Comedogenic: Won't clog pores, making it suitable for all skin types.<\/li><li>Hyaluronic Acid: Helps retain the skin's natural moisture for a soft, supple feel.<\/li><li>Fragrance-Free: Suitable for sensitive skin to avoid potential irritation.<\/li><li>Gentle and Allergy-Tested: Designed with your skin's well-being in mind.<\/li><\/ol><\/div><div><br \/><\/div><div>Experience the benefits of dermatologist-developed skincare with CeraVe Daily Moisturizing Lotion. Achieve the healthy, hydrated skin you deserve \u2013 order now!<\/div><div><br \/><\/div>","Note":"Directions: Apply liberally as often as needed, or as directed by a physician. Avoid direct contact with eyes. If contact occurs rinse thoroughly with water.","ProductWeight":"0.1","ProductionCountry":"United States","Gender":"Unisex","Season":"All Seasons","SkinType":"All skin types","Volume":"350ml","ManufacturerTxt":"<p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">CeraVe\u00ae Daily Moisturizing Lotion<\/p><p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">Developed with dermatologists, its unique formula - with 3 essential ceramides - moisturizes and helps restore the protective skin barrier.<\/p>"}},{"SellerSku":"007","ShopSku":"SI445ST3T2KP2NAFAMZ-402781746","Name":"Simple Replenishing Rich Moisturizer","Variation":"...","ParentSku":"007","Quantity":"2","Available":"2","Price":"5200","SalePrice":"4900","SaleStartDate":"2023-09-26 00:00:00","SaleEndDate":"2024-02-02 00:00:00","Status":"inactive","ProductId":"50114551103948","Url":"http:\/\/www.jumia.com.ng\/262572203.html","MainImage":"https:\/\/ng.jumia.is\/utNm2prlqeDaXn0qD5t6ie8WbTE=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/1.jpg?4933","Images":{"Image":["https:\/\/ng.jumia.is\/utNm2prlqeDaXn0qD5t6ie8WbTE=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/1.jpg?4933","https:\/\/ng.jumia.is\/FGZKoj7YVSJi5GVW7geO-XWJsy8=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/2.jpg?4933","https:\/\/ng.jumia.is\/nssV8e7m_Rp12US2yD5SzxIGGoE=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/3.jpg?4933","https:\/\/ng.jumia.is\/O78ssUBc4WzkMFROj4hpjQBZQLY=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/4.jpg?4933","https:\/\/ng.jumia.is\/uFFi5MD8y6yNUZWdtVaJjEpAsSg=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/5.jpg?4933","https:\/\/ng.jumia.is\/xtq9ozZ-EytRecZC_oXrshfGcJQ=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/6.jpg?4933"]},"Description":"<div>Introducing Simple Replenishing Rich Moisturizer - your key to 12 hours of continuous moisturization and smoother, healthier-looking skin. We believe that skincare should be kind to your skin, our planet, and people. That's why we've crafted this exceptional moisturizer with a unique blend of skin-loving ingredients to nourish and protect your skin.<\/div><div><br \/><\/div><div>Our dermatologist-tested formula is designed to address the ever-changing needs of your skin. Niacinamide works tirelessly to improve skin texture and even out your complexion, so you can confidently face your day. Vitamin B5 and Pro Amino Acids replenish and renew your skin's essential building blocks, ensuring a strong and resilient skin barrier. Meanwhile, Vitamin E promotes softer, smoother, and healthier-looking skin.<\/div><div><br \/><\/div><div>Simple Replenishing Rich Moisturizer is committed to kindness, not only to your skin but also to the world around us. We're on a mission to reduce our environmental footprint and promote kindness to others. Join us in the #ChooseKindness movement.<\/div><div><br \/><\/div><div>Our plant-based glycerin provides non-stop hydration for 12 hours, leaving your skin feeling fresh and revitalized. So, choose kindness for your skin and the planet. Make Simple Replenishing Rich Moisturizer a part of your daily skincare routine and experience the difference for yourself. Order now and embrace the beauty of healthy, radiant skin.<\/div><div><br \/><\/div>","TaxClass":"default","Brand":"Simple","PrimaryCategory":"BB Creams","PrimaryCategoryId":"1024357","ProductData":{"Model":"Simple replenishing rich moisturiser 12H MOISTURISATION SKIN SMOOTHING ACTIVES","ProductLine":"Anike Cosmetics","ShopType":"Jumia Mall","MainMaterial":"N\/A","ShortDescription":"<div>Key Highlights of Simple Replenishing Rich Moisturizer:<\/div><div><br \/><\/div><div><ol><li>12-Hour Moisturization: Provides continuous hydration for a full day of skin comfort.<\/li><li>Skin Smoothing Actives: Niacinamide and Vitamin E help improve texture, even complexion, and promote healthier-looking skin.<\/li><li>Skin-Friendly Ingredients: Contains Vitamin B5, Pro Amino Acids, and plant-based glycerin to replenish and renew your skin's natural barriers.<\/li><li>Dermatologist-Tested: Trust in a formula that's been tested and approved by dermatologists.<\/li><li>Kind to Skin and the Planet: A commitment to promoting kindness not only to your skin but also to the environment and others.<\/li><\/ol><\/div><div><br \/><\/div><div>Experience the benefits of Simple Replenishing Rich Moisturizer and enjoy smoother, healthier skin. Make the choice for skin that looks and feels its best \u2013 order now!<\/div><div><br \/><\/div>","ProductWeight":"0.01","ProductionCountry":"UK","Gender":"Unisex","Season":"All Seasons","SkinType":"All skin types","Volume":"125ml","ManufacturerTxt":"<p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">How to use: Apply morning and\/or evening on face and neck<\/p><p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">For best results, use after our facial wash.<\/p>"}},{"SellerSku":"008","ShopSku":"SI445ST3Q6EP2NAFAMZ-402786418","Name":"Simple Soothing Facial Toner","Variation":"...","ParentSku":"008","Quantity":"0","Available":"0","Price":"5200","SalePrice":"4900","SaleStartDate":"2023-09-26 00:00:00","SaleEndDate":"2024-02-27 00:00:00","Status":"inactive","ProductId":"5011451103856","Url":"http:\/\/www.jumia.com.ng\/262576352.html","MainImage":"https:\/\/ng.jumia.is\/GZPLCsogwa4MNVObotKnlhadPcA=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/1.jpg?4910","Images":{"Image":["https:\/\/ng.jumia.is\/GZPLCsogwa4MNVObotKnlhadPcA=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/1.jpg?4910","https:\/\/ng.jumia.is\/AlLNal-0w0IBqH_7yCvSXPaIMaM=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/2.jpg?4910","https:\/\/ng.jumia.is\/xVfSrEE-83wtdtxEAEzv8ENEv1Y=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/3.jpg?4910","https:\/\/ng.jumia.is\/r-wvwj9x0eQg6PRpisEi3NInAcQ=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/4.jpg?4910"]},"Description":"<div>Introducing Simple Soothing Facial Toner - a gentle and effective skincare essential that's 100% Alcohol-Free. At Simple, we believe in choosing kindness not only for your skin but also for our planet and people. Our commitment to a more caring approach to skincare is evident in every drop of this soothing toner.<\/div><div><br \/><\/div><div>This alcohol-free formula is designed with your skin's well-being in mind. It's gentle enough for all skin types, including sensitive skin, ensuring that your complexion is treated with the utmost care.&nbsp;<\/div><div><br \/><\/div><div>Using the Simple Soothing Facial Toner is a breeze. Simply apply it morning and night after cleansing your face. Its mild and non-irritating properties make it suitable for daily use.&nbsp;<\/div><div><br \/><\/div><div>Our unique blend of ingredients works to maintain your skin's natural balance and prepare it for the next steps in your skincare routine. It complements our other Simple products perfectly, such as our Hydrating Light Moisturizer, for a complete and caring skincare regimen.<\/div><div><br \/><\/div><div>Join us in choosing kindness for your skin, the planet, and people. Experience the soothing and refreshing benefits of Simple Soothing Facial Toner. Make it a part of your daily skincare ritual and let your skin revel in the gentle care it deserves. Order now and see the difference for yourself.<\/div><div><br \/><\/div>","TaxClass":"default","Brand":"Simple","PrimaryCategory":"Toners","PrimaryCategoryId":"1024373","ProductData":{"Model":"Simple soothing facial toner 100% ALCOHOL FREE","ProductLine":"Anike Cosmetics","ShopType":"Jumia Mall","MainMaterial":"N\/A","ShortDescription":"<div>Key Highlights of Simple Soothing Facial Toner:<\/div><div><br \/><\/div><div><ol><li>Alcohol-Free: Gentle and suitable for all skin types, including sensitive skin.<\/li><li>Kind to Skin: Formulated with your skin's well-being in mind, promoting a caring approach to skincare.<\/li><li>Easy Application: Simply apply morning and night after cleansing for a refreshed complexion.<\/li><li>Maintains Natural Balance: Helps balance your skin's natural equilibrium, preparing it for your skincare routine.<\/li><li>Perfect Pairing: Complements other Simple products like our Hydrating Light Moisturizer for a complete skincare regimen.<\/li><\/ol><\/div><div><br \/><\/div><div>Experience the soothing benefits of Simple Soothing Facial Toner and give your skin the gentle care it deserves. Make a wise choice for a more caring skincare routine \u2013 order now!<\/div>","Note":"WARNING: For external use only, Avoid getting no your eyes","ProductWeight":"0.01","ProductionCountry":"Poland","Gender":"Unisex","Season":"All Seasons","SkinType":"All skin types","Volume":"200ml"}},{"SellerSku":"009","ShopSku":"SI445ST3MMWF2NAFAMZ-402792930","Name":"Simple Moisturising Facial Wash","Variation":"White","ParentSku":"009","Quantity":"4","Available":"4","Price":"5200","SalePrice":"4900","SaleStartDate":"2023-09-26 00:00:00","SaleEndDate":"2024-01-27 00:00:00","Status":"inactive","ProductId":"5011451103870","Url":"http:\/\/www.jumia.com.ng\/262581491.html","MainImage":"https:\/\/ng.jumia.is\/HGCT1sxRR7TD8Bon2-lG0KBhHUs=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/1.jpg?6495","Images":{"Image":["https:\/\/ng.jumia.is\/HGCT1sxRR7TD8Bon2-lG0KBhHUs=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/1.jpg?6495","https:\/\/ng.jumia.is\/8dBq9IwDLc-glGerDYMUo1EEu7s=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/2.jpg?6495","https:\/\/ng.jumia.is\/SVGiShOcNTHWdf3dz3geF_R6QIg=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/3.jpg?6495","https:\/\/ng.jumia.is\/EDTI4UQCt7rLl6jcXExSyLl5wpo=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/4.jpg?6495","https:\/\/ng.jumia.is\/xtVx0AXvQhjsXJahadDZUbsu3Do=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/5.jpg?6495","https:\/\/ng.jumia.is\/hufDYl4NuxwguSv-RkkTnVEqUPA=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/6.jpg?6495","https:\/\/ng.jumia.is\/U3-UVIHvRAjNrNZcM8Q0L1bqvz8=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/7.jpg?6495"]},"Description":"<div>Discover the secret to smooth and healthy-looking skin with Simple Moisturising Facial Wash. At Simple, we believe in choosing kindness\u2014for your skin, our planet, and people. Our facial wash is not only effective but also planet-friendly, making it the perfect addition to your daily skincare routine.<\/div><div><br \/><\/div><div>This dermatologically-tested facial wash is designed to cleanse and nourish your skin gently. It's free from harsh chemicals that can upset your skin, making it suitable for all skin types, even the most sensitive. With no color, perfume, soap, alcohol, or mineral oil, you can trust that your skin is in safe hands.<\/div><div><br \/><\/div><div>Using Simple Moisturising Facial Wash is easy. Just lather a small amount in your hands, massage it onto wet skin, and rinse thoroughly with water. Follow up with your favorite Simple moisturizer for a complete skincare regimen.<\/div><div><br \/><\/div><div>Our special blend of ingredients, including Vitamin B5, Vitamin E, and Pro Amino Acids, helps your skin become stronger and more resilient with every wash. You'll notice the difference as your skin looks and feels smoother and healthier.<\/div><div><br \/><\/div><div>Join us in choosing kindness for your skin and the environment. Make Simple Moisturising Facial Wash a part of your daily routine and experience the benefits for yourself. Order now and let your skin thrive in the gentle care it deserves.<\/div>","TaxClass":"default","Brand":"Simple","PrimaryCategory":"Exfoliators","PrimaryCategoryId":"1024367","ProductData":{"Model":"Simple moisturising facial wash SMOOTH AND HEALTHY LOOKING SKIN","ProductLine":"Anike Cosmetics","ShopType":"Jumia Mall","MainMaterial":"N\/A","ShortDescription":"<div>Key Highlights of Simple Moisturising Facial Wash:<\/div><div><br \/><\/div><div><ol><li>Smooth and Healthy Skin: Achieve a radiant and healthy complexion with this facial wash.<\/li><li>Planet-Friendly: A skincare choice that's kind to your skin and the environment.<\/li><li>Gentle and Dermatologically Tested: Suitable for all skin types, even sensitive skin, with no harsh chemicals, colors, perfumes, soap, alcohol, or mineral oil.<\/li><li>Easy-to-Use: Simply lather, cleanse, and rinse for a refreshed face.<\/li><li>Nourishing Ingredients: Enriched with Vitamin B5, Vitamin E, and Pro Amino Acids for stronger, more resilient skin.<\/li><\/ol><\/div><div><br \/><\/div><div>Choose the gentle care of Simple Moisturising Facial Wash and experience the beauty of smooth and healthy skin. Elevate your skincare routine today \u2013 order now!<\/div><div><br \/><\/div>","Note":"WARNING: For external use only. Avoid getting into your eyes.","ProductWeight":"0.01","ProductionCountry":"UK","Gender":"Unisex","Season":"All Seasons","SkinType":"All skin types","Volume":"150ml"}},{"SellerSku":"010","ShopSku":"SI445ST3MMWF2NAFAMZ-402792931","Name":"Simple Moisturising Facial Wash","Variation":"Clear","ParentSku":"009","Quantity":"2","Available":"2","Price":"5200","SalePrice":"4900","SaleStartDate":"2023-09-26 00:00:00","SaleEndDate":"2024-01-27 00:00:00","Status":"inactive","ProductId":"5011451103863","Url":"http:\/\/www.jumia.com.ng\/262581491.html","MainImage":"https:\/\/ng.jumia.is\/HGCT1sxRR7TD8Bon2-lG0KBhHUs=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/1.jpg?6495","Images":{"Image":["https:\/\/ng.jumia.is\/HGCT1sxRR7TD8Bon2-lG0KBhHUs=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/1.jpg?6495","https:\/\/ng.jumia.is\/8dBq9IwDLc-glGerDYMUo1EEu7s=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/2.jpg?6495","https:\/\/ng.jumia.is\/SVGiShOcNTHWdf3dz3geF_R6QIg=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/3.jpg?6495","https:\/\/ng.jumia.is\/EDTI4UQCt7rLl6jcXExSyLl5wpo=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/4.jpg?6495","https:\/\/ng.jumia.is\/xtVx0AXvQhjsXJahadDZUbsu3Do=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/5.jpg?6495","https:\/\/ng.jumia.is\/hufDYl4NuxwguSv-RkkTnVEqUPA=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/6.jpg?6495","https:\/\/ng.jumia.is\/U3-UVIHvRAjNrNZcM8Q0L1bqvz8=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/7.jpg?6495"]},"Description":"<div>Discover the secret to smooth and healthy-looking skin with Simple Moisturising Facial Wash. At Simple, we believe in choosing kindness\u2014for your skin, our planet, and people. Our facial wash is not only effective but also planet-friendly, making it the perfect addition to your daily skincare routine.<\/div><div><br \/><\/div><div>This dermatologically-tested facial wash is designed to cleanse and nourish your skin gently. It's free from harsh chemicals that can upset your skin, making it suitable for all skin types, even the most sensitive. With no color, perfume, soap, alcohol, or mineral oil, you can trust that your skin is in safe hands.<\/div><div><br \/><\/div><div>Using Simple Moisturising Facial Wash is easy. Just lather a small amount in your hands, massage it onto wet skin, and rinse thoroughly with water. Follow up with your favorite Simple moisturizer for a complete skincare regimen.<\/div><div><br \/><\/div><div>Our special blend of ingredients, including Vitamin B5, Vitamin E, and Pro Amino Acids, helps your skin become stronger and more resilient with every wash. You'll notice the difference as your skin looks and feels smoother and healthier.<\/div><div><br \/><\/div><div>Join us in choosing kindness for your skin and the environment. Make Simple Moisturising Facial Wash a part of your daily routine and experience the benefits for yourself. Order now and let your skin thrive in the gentle care it deserves.<\/div>","TaxClass":"default","Brand":"Simple","PrimaryCategory":"Exfoliators","PrimaryCategoryId":"1024367","ProductData":{"Model":"Simple moisturising facial wash SMOOTH AND HEALTHY LOOKING SKIN","ProductLine":"Anike Cosmetics","ShopType":"Jumia Mall","MainMaterial":"N\/A","ShortDescription":"<div>Key Highlights of Simple Moisturising Facial Wash:<\/div><div><br \/><\/div><div><ol><li>Smooth and Healthy Skin: Achieve a radiant and healthy complexion with this facial wash.<\/li><li>Planet-Friendly: A skincare choice that's kind to your skin and the environment.<\/li><li>Gentle and Dermatologically Tested: Suitable for all skin types, even sensitive skin, with no harsh chemicals, colors, perfumes, soap, alcohol, or mineral oil.<\/li><li>Easy-to-Use: Simply lather, cleanse, and rinse for a refreshed face.<\/li><li>Nourishing Ingredients: Enriched with Vitamin B5, Vitamin E, and Pro Amino Acids for stronger, more resilient skin.<\/li><\/ol><\/div><div><br \/><\/div><div>Choose the gentle care of Simple Moisturising Facial Wash and experience the beauty of smooth and healthy skin. Elevate your skincare routine today \u2013 order now!<\/div><div><br \/><\/div>","Note":"WARNING: For external use only. Avoid getting into your eyes.","ProductWeight":"0.01","ProductionCountry":"UK","Gender":"Unisex","Season":"All Seasons","SkinType":"All skin types","Volume":"150ml"}}]}}}}

     */

    /*
    *
  {
   "SuccessResponse":{
      "Head":{
         "RequestId":"",
         "RequestAction":"GetProducts",
         "ResponseType":"Products",
         "Timestamp":"2023-09-30T13:20:05+0100"
      },
      "Body":{
         "Products":{
            "Product":[
               {
                  "SellerSku":"001",
                  "ShopSku":"DR093ST41S6ERNAFAMZ-395383898",
                  "Name":"DR. Rashel Vitamin C Face Serum",
                  "Variation":"...",
                  "ParentSku":"001",
                  "Quantity":"4",
                  "Available":"4",
                  "Price":"2500",
                  "SalePrice":"",
                  "SaleStartDate":"",
                  "SaleEndDate":"",
                  "Status":"inactive",
                  "ProductId":"6971764151953",
                  "Url":"http:\/\/www.jumia.com.ng\/259985844.html",
                  "MainImage":"https:\/\/ng.jumia.is\/rFmjqERDwPT6r-GeOh3vfHCInUY=\/fit-in\/500x500\/filters:fill(white)\/product\/44\/8589952\/1.jpg?8600",
                  "Images":{
                     "Image":[
                        "https:\/\/ng.jumia.is\/rFmjqERDwPT6r-GeOh3vfHCInUY=\/fit-in\/500x500\/filters:fill(white)\/product\/44\/8589952\/1.jpg?8600",
                        "https:\/\/ng.jumia.is\/xb57FkM2C7d7RxjoOhmG_yd4l-4=\/fit-in\/500x500\/filters:fill(white)\/product\/44\/8589952\/2.jpg?8600"
                     ]
                  },
                  "Description":"<div>DR\u00b7RASHEL Vitamin C Face Serum is a breakthrough skincare solution, meticulously crafted for remarkable results. This ultra-light serum offers a multitude of benefits for your skin, making it a must-have in your daily routine.<\/div><div><br \/><\/div><div>It is a powerful a vitamin c toner that helps protect your skin from antioxidants, free radicals.<\/div><div><br \/><\/div><div><div>Skin Rejuvenation: Our serum is packed with the potent goodness of Vitamin C, renowned for its ability to fade sunspots and correct discolorations, revealing a more even-toned complexion.<\/div><div><br \/><\/div><div>Texture Refinement: Experience smoother, refined skin texture as the serum reduces the formation of wrinkles and minimizes the appearance of existing ones.<\/div><div><br \/><\/div><div>Hydration and Protection: Enriched with a high concentration of pure vegan hyaluronic acid, it deeply hydrates and plumps skin cells, safeguarding against moisture loss and restoring vitality.<\/div><div><br \/><\/div><div>Youthful Radiance: Unlock a youthful glow as the serum brightens and revitalizes your skin, leaving you with a radiant, age-defying complexion.<\/div><div><br \/><\/div><div>Antioxidant Powerhouse: Powerful antioxidants within the formula neutralize free radicals, counteracting sun damage, and gradually fading sunspots and discoloration.<\/div><\/div>",
                  "TaxClass":"default",
                  "Brand":"Dr. Rashel",
                  "PrimaryCategory":"BB Creams",
                  "PrimaryCategoryId":"1024357",
                  "ProductData":{
                     "Model":"vitamin c brightening & anti-aging face serum",
                     "Color":"Orange",
                     "ProductLine":"Anike Cosmetics",
                     "ShopType":"Jumia Mall",
                     "ColorFamily":"Orange",
                     "MainMaterial":"N\/A",
                     "Fda":"N\/A",
                     "ShortDescription":"<div>Advanced Skin Renewal: This serum harnesses the power of Vitamin C to visibly diminish sunspots, discoloration, and refine your skin's texture for a smoother, more youthful appearance.<\/div><div><br \/><\/div><div>Youthful Radiance: Experience a radiant complexion as this serum brightens your skin, leaving it looking revitalized and glowing with health.<\/div><div><br \/><\/div><div>Wrinkle Reduction: Say goodbye to wrinkles and fine lines. This serum helps reduce their appearance and prevents new ones from forming.<\/div><div><br \/><\/div><div>Deep Hydration: Infused with pure vegan hyaluronic acid, it deeply hydrates your skin, plumping it up for a fresher and more vibrant look.<\/div><div><br \/><\/div><div>Antioxidant Defense: Powerful antioxidants combat free radicals, preventing and reversing sun damage while fading sunspots and discoloration.<\/div><div><br \/><\/div><div>Easy Application: Simply apply to your face and neck morning and evening after cleansing, and gently massage for enhanced absorption.<\/div><div><br \/><\/div><div>Choose DR\u00b7RASHEL Vitamin C Face Serum for radiant, younger-looking skin that's protected against the signs of aging and sun damage. Elevate your skincare routine today.<\/div><div><br \/><\/div>",
                     "PackageContent":"1 bottle of Dr. Rashel Vitamin C",
                     "Note":"For external use, keep out of reach of children. Store in a cool and dry place. Avoid direct contact with eyes, if contact occurs, rinse well with water.",
                     "ProductWeight":"0.01",
                     "Gender":"Unisex",
                     "Season":"All Seasons",
                     "SkinType":"All skin types",
                     "Volume":"100ml",
                     "ManufacturerTxt":"Directions: Wash your face. Take the proper amount on your hand and with a gentle flap until absorbing perfectly. Or soak a cotton pad with toner and gently wipe across your face, eyes and neck to cleanse and tone."
                  }
               },
               {
                  "SellerSku":"002",
                  "ShopSku":"SK132ST4KV9ZMNAFAMZ-396361202",
                  "Name":"Skin Doctor SPF 80 UVA + UVB High Protection Hyaluronic Acid",
                  "Variation":"...",
                  "ParentSku":"002",
                  "Quantity":"6",
                  "Available":"6",
                  "Price":"3900",
                  "SalePrice":"3500",
                  "SaleStartDate":"2023-09-16 00:00:00",
                  "SaleEndDate":"2024-05-11 00:00:00",
                  "Status":"inactive",
                  "ProductId":"8858854602909",
                  "Url":"http:\/\/www.jumia.com.ng\/260361967.html",
                  "MainImage":"https:\/\/ng.jumia.is\/EzcUrXfb4dtWF8FjgrR0d6aIYQI=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/1.jpg?9847",
                  "Images":{
                     "Image":[
                        "https:\/\/ng.jumia.is\/EzcUrXfb4dtWF8FjgrR0d6aIYQI=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/1.jpg?9847",
                        "https:\/\/ng.jumia.is\/b_dh3ByOcUiokxG5efs2bWTeTxk=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/2.jpg?9847",
                        "https:\/\/ng.jumia.is\/j8BhAIepiSf4r0qkEToKss8q6no=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/3.jpg?9847",
                        "https:\/\/ng.jumia.is\/eUk0sFBtdt4Jx7dfQRl2L6PU-RE=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/4.jpg?9847",
                        "https:\/\/ng.jumia.is\/x4pbNXjAvBAwEmQ2s4-AaKfQ_mg=\/fit-in\/500x500\/filters:fill(white)\/product\/76\/9163062\/5.jpg?9847"
                     ]
                  },
                  "Description":"<div>Introducing Skin Doctor SPF 80 UVA + UVB: Your Complete Sun Protection Solution!<\/div><div><br \/><\/div><div>Experience the ultimate in sun protection with Skin Doctor SPF 80 UVA + UVB, a breakthrough face cream designed to shield your skin from the sun's harmful rays while rejuvenating your complexion.<\/div><div><br \/><\/div><div>Our advanced Protection System technology harnesses the power of the latest generation of photostable filters, providing multidimensional protection against both UVA and UVB rays. This cutting-edge formula not only prevents photo-aging but also guarantees long-lasting DNA protection, so your skin can stay youthful and resilient.<\/div><div><br \/><\/div><div>Say goodbye to worries about pigmentation spots; Skin Doctor SPF 80 actively prevents their formation while delivering deep, intensive hydration to nourish your skin from within. The result? A radiant, revitalized complexion that exudes health and vitality.<\/div><div><br \/><\/div><div>What sets Skin Doctor SPF 80 apart is its perfectly absorbing, non-greasy formula. You can trust this cream to provide superior sun protection without leaving any unwanted residue, making it an ideal addition to your daily skincare routine.<\/div><div><br \/><\/div><div>Don't compromise on your skin's health. Elevate your sun protection game with Skin Doctor SPF 80 UVA + UVB and embrace a future of beautifully protected, youthful skin.<\/div>",
                  "TaxClass":"default",
                  "Brand":"Skin Doctor",
                  "PrimaryCategory":"BB Creams",
                  "PrimaryCategoryId":"1024357",
                  "ProductData":{
                     "Model":"SPF 80 UVA + UVB High Protection with Hyaluronic Acid and Vitamins A,E,F.",
                     "ProductLine":"Anike Cosmetics",
                     "ShopType":"Jumia Mall",
                     "ShortDescription":"<div>1. Unrivaled Sun Protection: Skin Doctor SPF 80 offers unparalleled UVA and UVB protection, safeguarding your skin from the sun's damaging effects. Keep your skin's DNA safe and bid farewell to pigmentation spots.<\/div><div><div><br \/><\/div><div>2. Intense Moisturization: Pamper your skin with deep, lasting hydration. Luxurious formula locks in moisture, leaving your skin feeling supple and revitalized.<\/div><div><br \/><\/div><div>3. Skin-Improving Magic: Skin Doctor SPF 80 doesn't just protect; it also works to enhance your skin's overall condition. Experience the difference as your complexion becomes smoother and more radiant.<\/div><div><br \/><\/div><div>4. Non-Greasy Perfection: Say goodbye to that unwanted oily residue. Our fast-absorbing formula ensures a non-greasy, matte finish, making it perfect for daily use.<\/div><\/div>",
                     "PackageContent":"One tube.",
                     "Note":"For external use, keep out of reach of children. For sensitive and Allergy prone skin",
                     "ProductWeight":"0.01",
                     "SkinType":"All skin types",
                     "Volume":"125ml",
                     "ManufacturerTxt":"Sun protection face cream with high sun filter is designated for care of sensitive and allergy prone skin."
                  }
               },
               {
                  "SellerSku":"003",
                  "ShopSku":"SK132ST3S6YKUNAFAMZ-402719907",
                  "Name":"Skin Doctor Sun 80 SPF UVA+UVB HIGH PROTECTION",
                  "Variation":"...",
                  "ParentSku":"003",
                  "Quantity":"4",
                  "Available":"4",
                  "Price":"4000",
                  "SalePrice":"3800",
                  "SaleStartDate":"2023-09-26 00:00:00",
                  "SaleEndDate":"2024-03-01 00:00:00",
                  "Status":"inactive",
                  "ProductId":"8858854602886",
                  "Url":"http:\/\/www.jumia.com.ng\/262525782.html",
                  "MainImage":"https:\/\/ng.jumia.is\/Ci5SePpbFTJSHZ3d4sxwNlV2kAg=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/1.jpg?0783",
                  "Images":{
                     "Image":[
                        "https:\/\/ng.jumia.is\/Ci5SePpbFTJSHZ3d4sxwNlV2kAg=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/1.jpg?0783",
                        "https:\/\/ng.jumia.is\/_y1LOgXx4vBYrFpVhR079nvMNnQ=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/2.jpg?0783",
                        "https:\/\/ng.jumia.is\/uZAWgmWXR-u-92EcYDVrULnmaIo=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/3.jpg?0783",
                        "https:\/\/ng.jumia.is\/InrP-rhESJVT8LNlF78Uczq9K04=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/4.jpg?0783",
                        "https:\/\/ng.jumia.is\/04g1RWZuRY2DO7rPjKR03ZfJofs=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/5.jpg?0783",
                        "https:\/\/ng.jumia.is\/sdjB8O68tpCtoUwoAPveFxtanAI=\/fit-in\/500x500\/filters:fill(white)\/product\/28\/7525262\/6.jpg?0783"
                     ]
                  },
                  "Description":"<div>Skin Doctor Whitening Sun Protection Face Cream - Your Ultimate Defense Against Sun Damage!<\/div><div><br \/><\/div><div>Experience the utmost care and protection for your sensitive and allergy-prone skin with Skin Doctor's Whitening Sun Protection Face Cream. With an impressive SPF 80, this advanced formula is designed to shield your skin from the sun's harmful rays while delivering a host of skincare benefits.<\/div><div><br \/><\/div><div>High Protection System\u2122 Technology: Our cream employs cutting-edge High Protection System\u2122 technology, featuring the latest generation of photostable filters. This technology provides comprehensive protection against both UVA and UVB rays, effectively preventing photo-aging. It goes the extra mile by ensuring long-lasting DNA protection for your skin.<\/div><div><br \/><\/div><div>Say Goodbye to Pigmentation Spots: Bid farewell to unsightly pigmentation spots! Skin Doctor's Whitening Sun Protection Face Cream actively works to prevent their appearance, leaving your skin looking radiant and even-toned.<\/div><div><br \/><\/div><div>Intensive Moisturization: This exceptional formula doesn't just protect; it also hydrates. Dive deep into layers of your skin with its intense moisturization, ensuring a well-nourished and rejuvenated complexion.<\/div><div><br \/><\/div><div>Say yes to glowing, protected skin! Elevate your skincare routine with Skin Doctor's Whitening Sun Protection Face Cream. Don't let the sun steal your skin's radiance; safeguard it with the power of innovation and care. Get your Skin Doctor Whitening Sun Protection Face Cream today, and step into a world of beauty and protection like never before!<\/div>",
                  "TaxClass":"default",
                  "Brand":"Skin Doctor",
                  "PrimaryCategory":"BB Creams",
                  "PrimaryCategoryId":"1024357",
                  "ProductData":{
                     "Model":"Skind Doctor Sun 80 UVA+UVB with HIGH PROTECTION HYALURONIC ACID and VITAMINS A, E, F. FOR SENSITIVE AND ALLERGY-PRONE",
                     "ProductLine":"Anike Cosmetics",
                     "ShopType":"Jumia Mall",
                     "MainMaterial":"N\/A",
                     "ShortDescription":"<ol><li><\/li><li>High SPF 80: Offers superior sun protection for sensitive and allergy-prone skin.<\/li><li>High Protection System\u2122 Technology: Advanced filters guard against UVA\/UVB rays and prevent photo-aging.<\/li><li>Prevents Pigmentation Spots: Say goodbye to uneven skin tone with proactive pigmentation spot prevention.<\/li><li>Intensive Moisturization: Provides deep hydration for nourished, radiant skin.<\/li><li>Long-Lasting DNA Protection: Ensures your skin's DNA remains safeguarded against sun damage.<\/li><li>Ideal for Sensitive Skin: Designed specifically for those with sensitive and allergy-prone skin.<\/li><li>All-in-One Solution: Combines sun protection, hydration, and skin rejuvenation in one cream.<\/li><li>Dermatologically Tested: Clinically proven to be safe and effective for daily use.<\/li><\/ol>",
                     "ProductWeight":"0.01",
                     "ProductionCountry":"Thailand",
                     "Gender":"Unisex",
                     "Season":"All Seasons",
                     "SkinType":"All skin types",
                     "Volume":"150ml",
                     "ManufacturerTxt":"<p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">APPLICATION: Apply before and during sun exposure. Reapply many times during a day.<\/p>"
                  }
               },
               {
                  "SellerSku":"004",
                  "ShopSku":"",
                  "Name":"Skin Doctor Sun SPF 60",
                  "Variation":"...",
                  "ParentSku":"004",
                  "Quantity":"4",
                  "Available":"4",
                  "Price":"4000",
                  "SalePrice":"3800",
                  "SaleStartDate":"2023-09-26 00:00:00",
                  "SaleEndDate":"2024-03-23 00:00:00",
                  "Status":"inactive",
                  "ProductId":"8858854602879",
                  "Url":"",
                  "MainImage":"",
                  "Images":{
                     "Image":[
                        "https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/6\/d\/7\/d\/6d7d63ea2bd9138615ef244f04ab4a02.png",
                        "https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/a\/f\/4\/7\/af4777bd50ea6d019e1f09e26bfeafd3.jpeg",
                        "https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/e\/9\/1\/7\/e91777d3e24be74f40ee26d25fc1d78f.jpeg",
                        "https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/c\/e\/f\/e\/cefe3c32a15fc6d41227ab7cf9412cfc.jpeg",
                        "https:\/\/media-ng-sc-live-jvc.s3.eu-central-1.amazonaws.com\/media\/3\/f\/3\/d\/3f3dac7f3952670ed38011db116ec981.jpeg"
                     ]
                  },
                  "Description":"<div>Indulge in the luxurious care of Skin Doctor Whitening Sun Protection Face Cream, your path to enjoying fair and flawless skin without the risk of discolorations. This innovative product seamlessly combines the benefits of sun protection with intensive whitening care.<\/div><div><br \/><\/div><div>Our advanced formula features an active whitening complex that not only shields your skin from harmful UV rays but also works diligently to protect your skin's DNA, leaving it fair, radiant, and free from imperfections.&nbsp;<\/div><div><br \/><\/div><div>At the heart of this cream is our proprietary HIGH PROTECT SYSTEM\u2122, a state-of-the-art, photostable sunscreen technology from the latest generation. It goes above and beyond in effectively safeguarding your skin against the damaging effects of both UVA and UVB radiation.<\/div><div><br \/><\/div><div>Experience the confidence that comes with flawless, fair skin. Skin Doctor Whitening Sun Protection Face Cream is your trusted companion for maintaining a luminous complexion while defending against the sun's harmful rays. Revel in the beauty of sun-kissed skin without compromising on protection. Say hello to a brighter, more radiant you!<\/div><div><br \/><\/div><div>Elevate your skincare routine with Skin Doctor today!<\/div>",
                  "TaxClass":"default",
                  "Brand":"Skin Doctor",
                  "PrimaryCategory":"BB Creams",
                  "PrimaryCategoryId":"1024357"
               },
               {
                  "SellerSku":"005",
                  "ShopSku":"BR057ST4PGQY6NAFAMZ-402772306",
                  "Name":"Medix 5.5\u2122 Vitamin C Turmeric Firming And Brightening Cream",
                  "Variation":"...",
                  "ParentSku":"005",
                  "Quantity":"6",
                  "Available":"6",
                  "Price":"16000",
                  "SalePrice":"15500",
                  "SaleStartDate":"2023-09-26 00:00:00",
                  "SaleEndDate":"2024-05-11 00:00:00",
                  "Status":"inactive",
                  "ProductId":"810400035447",
                  "Url":"http:\/\/www.jumia.com.ng\/262563648.html",
                  "MainImage":"https:\/\/ng.jumia.is\/yrxHoxDstfJW2qkew9-oM2ZjDI4=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/1.jpg?2182",
                  "Images":{
                     "Image":[
                        "https:\/\/ng.jumia.is\/yrxHoxDstfJW2qkew9-oM2ZjDI4=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/1.jpg?2182",
                        "https:\/\/ng.jumia.is\/BbnDmUFeZHcIioApx7yNBZxjL-Q=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/2.jpg?2182",
                        "https:\/\/ng.jumia.is\/HGLHmAM39G68mRsdLdLYVB1PczA=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/3.jpg?2182",
                        "https:\/\/ng.jumia.is\/ABidX0CbPI-a4BHX3eKVEgF36ZY=\/fit-in\/500x500\/filters:fill(white)\/product\/84\/6365262\/4.jpg?2182"
                     ]
                  },
                  "Description":"<div>Introducing the Medix 5.5\u2122 Vitamin C + Turmeric Firming and Brightening Cream - your ultimate skincare solution for radiant, youthful, and healthy-looking skin. This powerful cream comes in a sleek package with a mission to transform your daily skincare routine.<\/div><div><br \/><\/div><div>The secret to beautiful skin lies in maintaining a healthy skin barrier with a pH of 5.5, and Medix 5.5\u2122 is here to make it effortless for you. This innovative formula is designed to reduce the appearance of imperfections while fortifying your skin's protective barrier. By doing so, it locks in moisture and shields your skin from harmful pollutants, leaving you with a complexion that's beautifully smooth and firm.<\/div><div><br \/><\/div><div>But that's not all. Medix 5.5\u2122 goes the extra mile by infusing this cream with Vitamin C and Turmeric, known for their brightening and antioxidant properties. This dynamic duo helps restore elasticity, improve the look of dark spots, and leave your skin with a radiant, youthful glow.<\/div><div><br \/><\/div><div>Medix 5.5\u2122 is proud to be vegan and cruelty-free, and it's formulated without harsh ingredients like parabens, drying alcohols, sulfates, and more. Say goodbye to unwanted additives and hello to a cleaner, healthier skincare routine.<\/div><div><br \/><\/div><div>Unlock the potential of your skin with Medix 5.5\u2122 Vitamin C + Turmeric Firming and Brightening Cream. Experience the transformation, and let your natural beauty shine through. Order now and start your journey to radiant, youthful skin!<\/div><div><br \/><\/div><div><br \/><\/div>",
                  "TaxClass":"default",
                  "Brand":"Medix5 5",
                  "PrimaryCategory":"BB Creams",
                  "PrimaryCategoryId":"1024357",
                  "ProductData":{
                     "Model":"Medix 5.5\u2122 Vitamin C + Turmeric Firming and Brightening Cream",
                     "ProductLine":"Anike Cosmetics",
                     "ShopType":"Jumia Mall",
                     "MainMaterial":"N\/A",
                     "ShortDescription":"<div>Key Highlights of Medix 5.5\u2122 Vitamin C + Turmeric Firming and Brightening Cream:<\/div><div><br \/><\/div><div><ol><li>pH 5.5 Skin Barrier Support: Maintain a healthy skin barrier for smoother, firmer, and healthier-looking skin.<\/li><li><br \/><\/li><li>Vitamin C and Turmeric: Infused with brightening Vitamin C and antioxidant-rich Turmeric to improve skin tone and reduce dark spots.<\/li><li><br \/><\/li><li>Vegan and Cruelty-Free: Ethically formulated, ensuring no harm to animals in the process.<\/li><li><br \/><\/li><li>Free from Harmful Ingredients: Contains no parabens, drying alcohols, sulfates, or other harsh additives.<\/li><li><br \/><\/li><li>Ginseng and Vitamin E: These ingredients restore elasticity and promote skin rejuvenation.<\/li><li><br \/><\/li><li>Moisture Lock: Keeps your skin hydrated by sealing in moisture and protecting against pollutants.<\/li><li><br \/><\/li><li>Easy-to-Use Pump: A convenient pump dispenser ensures precise application with every use.<\/li><\/ol><\/div><div><br \/><\/div><div>Transform your skincare routine with Medix 5.5\u2122 - the perfect blend of science and nature for radiant, youthful skin. Upgrade your skincare game today!<\/div><div><br \/><\/div>",
                     "ProductWeight":"0.1",
                     "ProductionCountry":"United States",
                     "Gender":"Unisex",
                     "Season":"All Seasons",
                     "SkinType":"All skin types",
                     "Volume":"400ml",
                     "ManufacturerTxt":"<p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">Directions: Massage liberally onto skin dailv, focusing on wrinkles and dark spots.<\/p><p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">Caution: For external use only. If irritation develops discontinue use.<\/p><p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\"><br \/><\/p>"
                  }
               },
               {
                  "SellerSku":"006",
                  "ShopSku":"CR233ST3ZETIMNAFAMZ-402776928",
                  "Name":"CeraVe Daily Moisturizing Lotion",
                  "Variation":"...",
                  "ParentSku":"006",
                  "Quantity":"3",
                  "Available":"3",
                  "Price":"19000",
                  "SalePrice":"18600",
                  "SaleStartDate":"2023-09-26 00:00:00",
                  "SaleEndDate":"2024-08-01 00:00:00",
                  "Status":"inactive",
                  "ProductId":"3612621748253",
                  "Url":"http:\/\/www.jumia.com.ng\/262567804.html",
                  "MainImage":"https:\/\/ng.jumia.is\/HfHGU0mBeZZlzLPY2-B8AFsrRe8=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/1.jpg?4948",
                  "Images":{
                     "Image":[
                        "https:\/\/ng.jumia.is\/HfHGU0mBeZZlzLPY2-B8AFsrRe8=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/1.jpg?4948",
                        "https:\/\/ng.jumia.is\/xlmyb8zPK_RJjF5TZe1Ff3f78Nw=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/2.jpg?4948",
                        "https:\/\/ng.jumia.is\/aNUKnkn77HO90AX1gazxO0lam98=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/3.jpg?4948",
                        "https:\/\/ng.jumia.is\/B4PTCU3tBFeIBGVtsYM5PIRQKJc=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/4.jpg?4948",
                        "https:\/\/ng.jumia.is\/nmzRRFIYooAQJGgYGJBFGCbV6lE=\/fit-in\/500x500\/filters:fill(white)\/product\/40\/8765262\/5.jpg?4948"
                     ]
                  },
                  "Description":"<div>Introducing CeraVe Daily Moisturizing Lotion, your go-to solution for maintaining healthy and hydrated skin. Developed in collaboration with dermatologists, this exceptional lotion is specially formulated for normal to dry skin types, making it a must-have addition to your daily skincare routine.<\/div><div><br \/><\/div><div>What sets CeraVe apart is its unique blend of 3 essential ceramides, which work harmoniously to moisturize and restore your skin's protective barrier. This barrier is crucial in retaining moisture and defending against external factors that can cause dryness and irritation.<\/div><div><br \/><\/div><div>CeraVe employs cutting-edge MVE\u00ae Delivery Technology, ensuring controlled and continuous hydration throughout the day. This means your skin stays nourished and comfortable, without any heaviness or greasiness. The lightweight and oil-free formula make it perfect for daily use, and it won't clog your pores, thanks to its non-comedogenic nature.<\/div><div><br \/><\/div><div>Hyaluronic Acid, another key ingredient, plays a vital role in retaining your skin's natural moisture, leaving it feeling soft, supple, and refreshed. Plus, it's fragrance-free, making it suitable for even the most sensitive skin types and avoiding any potential irritation.<\/div><div><br \/><\/div><div>Gentle, allergy-tested, and non-comedogenic, CeraVe Daily Moisturizing Lotion is designed to pamper your skin and help it stay healthy and hydrated. Unlock the secret to smoother, more comfortable skin and make CeraVe a part of your daily skincare ritual. Trust the dermatologist-developed brand that cares for your skin as much as you do. Order now!<\/div><div><br \/><\/div>",
                  "TaxClass":"default",
                  "Brand":"Crave",
                  "PrimaryCategory":"Lotions",
                  "PrimaryCategoryId":"1024319",
                  "ProductData":{
                     "Model":"CeraVe DEVELOPED WITH DERMATOLOGISTS Daily Moisturizing Lotion For Normal to Dry Skin",
                     "ProductLine":"Anike Cosmetics",
                     "ShopType":"Jumia Mall",
                     "MainMaterial":"N\/A",
                     "ShortDescription":"<div>Key Highlights of CeraVe Daily Moisturizing Lotion:<\/div><div><br \/><\/div><div><ol><li>Developed with Dermatologists: Trusted by skincare experts for its effectiveness and safety.<\/li><li>Essential Ceramides: Formulated with 3 essential ceramides to moisturize and restore the skin barrier.<\/li><li>MVE\u00ae Delivery Technology: Provides all-day hydration through controlled release.<\/li><li>Lightweight & Oil-Free: Perfect for daily use without a heavy or greasy feeling.<\/li><li>Non-Comedogenic: Won't clog pores, making it suitable for all skin types.<\/li><li>Hyaluronic Acid: Helps retain the skin's natural moisture for a soft, supple feel.<\/li><li>Fragrance-Free: Suitable for sensitive skin to avoid potential irritation.<\/li><li>Gentle and Allergy-Tested: Designed with your skin's well-being in mind.<\/li><\/ol><\/div><div><br \/><\/div><div>Experience the benefits of dermatologist-developed skincare with CeraVe Daily Moisturizing Lotion. Achieve the healthy, hydrated skin you deserve \u2013 order now!<\/div><div><br \/><\/div>",
                     "Note":"Directions: Apply liberally as often as needed, or as directed by a physician. Avoid direct contact with eyes. If contact occurs rinse thoroughly with water.",
                     "ProductWeight":"0.1",
                     "ProductionCountry":"United States",
                     "Gender":"Unisex",
                     "Season":"All Seasons",
                     "SkinType":"All skin types",
                     "Volume":"350ml",
                     "ManufacturerTxt":"<p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">CeraVe\u00ae Daily Moisturizing Lotion<\/p><p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">Developed with dermatologists, its unique formula - with 3 essential ceramides - moisturizes and helps restore the protective skin barrier.<\/p>"
                  }
               },
               {
                  "SellerSku":"007",
                  "ShopSku":"SI445ST3T2KP2NAFAMZ-402781746",
                  "Name":"Simple Replenishing Rich Moisturizer",
                  "Variation":"...",
                  "ParentSku":"007",
                  "Quantity":"2",
                  "Available":"2",
                  "Price":"5200",
                  "SalePrice":"4900",
                  "SaleStartDate":"2023-09-26 00:00:00",
                  "SaleEndDate":"2024-02-02 00:00:00",
                  "Status":"inactive",
                  "ProductId":"50114551103948",
                  "Url":"http:\/\/www.jumia.com.ng\/262572203.html",
                  "MainImage":"https:\/\/ng.jumia.is\/utNm2prlqeDaXn0qD5t6ie8WbTE=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/1.jpg?4933",
                  "Images":{
                     "Image":[
                        "https:\/\/ng.jumia.is\/utNm2prlqeDaXn0qD5t6ie8WbTE=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/1.jpg?4933",
                        "https:\/\/ng.jumia.is\/FGZKoj7YVSJi5GVW7geO-XWJsy8=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/2.jpg?4933",
                        "https:\/\/ng.jumia.is\/nssV8e7m_Rp12US2yD5SzxIGGoE=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/3.jpg?4933",
                        "https:\/\/ng.jumia.is\/O78ssUBc4WzkMFROj4hpjQBZQLY=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/4.jpg?4933",
                        "https:\/\/ng.jumia.is\/uFFi5MD8y6yNUZWdtVaJjEpAsSg=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/5.jpg?4933",
                        "https:\/\/ng.jumia.is\/xtq9ozZ-EytRecZC_oXrshfGcJQ=\/fit-in\/500x500\/filters:fill(white)\/product\/30\/2275262\/6.jpg?4933"
                     ]
                  },
                  "Description":"<div>Introducing Simple Replenishing Rich Moisturizer - your key to 12 hours of continuous moisturization and smoother, healthier-looking skin. We believe that skincare should be kind to your skin, our planet, and people. That's why we've crafted this exceptional moisturizer with a unique blend of skin-loving ingredients to nourish and protect your skin.<\/div><div><br \/><\/div><div>Our dermatologist-tested formula is designed to address the ever-changing needs of your skin. Niacinamide works tirelessly to improve skin texture and even out your complexion, so you can confidently face your day. Vitamin B5 and Pro Amino Acids replenish and renew your skin's essential building blocks, ensuring a strong and resilient skin barrier. Meanwhile, Vitamin E promotes softer, smoother, and healthier-looking skin.<\/div><div><br \/><\/div><div>Simple Replenishing Rich Moisturizer is committed to kindness, not only to your skin but also to the world around us. We're on a mission to reduce our environmental footprint and promote kindness to others. Join us in the #ChooseKindness movement.<\/div><div><br \/><\/div><div>Our plant-based glycerin provides non-stop hydration for 12 hours, leaving your skin feeling fresh and revitalized. So, choose kindness for your skin and the planet. Make Simple Replenishing Rich Moisturizer a part of your daily skincare routine and experience the difference for yourself. Order now and embrace the beauty of healthy, radiant skin.<\/div><div><br \/><\/div>",
                  "TaxClass":"default",
                  "Brand":"Simple",
                  "PrimaryCategory":"BB Creams",
                  "PrimaryCategoryId":"1024357",
                  "ProductData":{
                     "Model":"Simple replenishing rich moisturiser 12H MOISTURISATION SKIN SMOOTHING ACTIVES",
                     "ProductLine":"Anike Cosmetics",
                     "ShopType":"Jumia Mall",
                     "MainMaterial":"N\/A",
                     "ShortDescription":"<div>Key Highlights of Simple Replenishing Rich Moisturizer:<\/div><div><br \/><\/div><div><ol><li>12-Hour Moisturization: Provides continuous hydration for a full day of skin comfort.<\/li><li>Skin Smoothing Actives: Niacinamide and Vitamin E help improve texture, even complexion, and promote healthier-looking skin.<\/li><li>Skin-Friendly Ingredients: Contains Vitamin B5, Pro Amino Acids, and plant-based glycerin to replenish and renew your skin's natural barriers.<\/li><li>Dermatologist-Tested: Trust in a formula that's been tested and approved by dermatologists.<\/li><li>Kind to Skin and the Planet: A commitment to promoting kindness not only to your skin but also to the environment and others.<\/li><\/ol><\/div><div><br \/><\/div><div>Experience the benefits of Simple Replenishing Rich Moisturizer and enjoy smoother, healthier skin. Make the choice for skin that looks and feels its best \u2013 order now!<\/div><div><br \/><\/div>",
                     "ProductWeight":"0.01",
                     "ProductionCountry":"UK",
                     "Gender":"Unisex",
                     "Season":"All Seasons",
                     "SkinType":"All skin types",
                     "Volume":"125ml",
                     "ManufacturerTxt":"<p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">How to use: Apply morning and\/or evening on face and neck<\/p><p style=\"margin: 0px; font-variant-numeric: normal; font-variant-east-asian: normal; font-variant-alternates: normal; font-kerning: auto; font-optical-sizing: auto; font-feature-settings: normal; font-variation-settings: normal; font-variant-position: normal; font-stretch: normal; font-size: 12px; line-height: normal; font-family: Helvetica; color: rgb(0, 0, 0);\">For best results, use after our facial wash.<\/p>"
                  }
               },
               {
                  "SellerSku":"008",
                  "ShopSku":"SI445ST3Q6EP2NAFAMZ-402786418",
                  "Name":"Simple Soothing Facial Toner",
                  "Variation":"...",
                  "ParentSku":"008",
                  "Quantity":"0",
                  "Available":"0",
                  "Price":"5200",
                  "SalePrice":"4900",
                  "SaleStartDate":"2023-09-26 00:00:00",
                  "SaleEndDate":"2024-02-27 00:00:00",
                  "Status":"inactive",
                  "ProductId":"5011451103856",
                  "Url":"http:\/\/www.jumia.com.ng\/262576352.html",
                  "MainImage":"https:\/\/ng.jumia.is\/GZPLCsogwa4MNVObotKnlhadPcA=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/1.jpg?4910",
                  "Images":{
                     "Image":[
                        "https:\/\/ng.jumia.is\/GZPLCsogwa4MNVObotKnlhadPcA=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/1.jpg?4910",
                        "https:\/\/ng.jumia.is\/AlLNal-0w0IBqH_7yCvSXPaIMaM=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/2.jpg?4910",
                        "https:\/\/ng.jumia.is\/xVfSrEE-83wtdtxEAEzv8ENEv1Y=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/3.jpg?4910",
                        "https:\/\/ng.jumia.is\/r-wvwj9x0eQg6PRpisEi3NInAcQ=\/fit-in\/500x500\/filters:fill(white)\/product\/25\/3675262\/4.jpg?4910"
                     ]
                  },
                  "Description":"<div>Introducing Simple Soothing Facial Toner - a gentle and effective skincare essential that's 100% Alcohol-Free. At Simple, we believe in choosing kindness not only for your skin but also for our planet and people. Our commitment to a more caring approach to skincare is evident in every drop of this soothing toner.<\/div><div><br \/><\/div><div>This alcohol-free formula is designed with your skin's well-being in mind. It's gentle enough for all skin types, including sensitive skin, ensuring that your complexion is treated with the utmost care.&nbsp;<\/div><div><br \/><\/div><div>Using the Simple Soothing Facial Toner is a breeze. Simply apply it morning and night after cleansing your face. Its mild and non-irritating properties make it suitable for daily use.&nbsp;<\/div><div><br \/><\/div><div>Our unique blend of ingredients works to maintain your skin's natural balance and prepare it for the next steps in your skincare routine. It complements our other Simple products perfectly, such as our Hydrating Light Moisturizer, for a complete and caring skincare regimen.<\/div><div><br \/><\/div><div>Join us in choosing kindness for your skin, the planet, and people. Experience the soothing and refreshing benefits of Simple Soothing Facial Toner. Make it a part of your daily skincare ritual and let your skin revel in the gentle care it deserves. Order now and see the difference for yourself.<\/div><div><br \/><\/div>",
                  "TaxClass":"default",
                  "Brand":"Simple",
                  "PrimaryCategory":"Toners",
                  "PrimaryCategoryId":"1024373",
                  "ProductData":{
                     "Model":"Simple soothing facial toner 100% ALCOHOL FREE",
                     "ProductLine":"Anike Cosmetics",
                     "ShopType":"Jumia Mall",
                     "MainMaterial":"N\/A",
                     "ShortDescription":"<div>Key Highlights of Simple Soothing Facial Toner:<\/div><div><br \/><\/div><div><ol><li>Alcohol-Free: Gentle and suitable for all skin types, including sensitive skin.<\/li><li>Kind to Skin: Formulated with your skin's well-being in mind, promoting a caring approach to skincare.<\/li><li>Easy Application: Simply apply morning and night after cleansing for a refreshed complexion.<\/li><li>Maintains Natural Balance: Helps balance your skin's natural equilibrium, preparing it for your skincare routine.<\/li><li>Perfect Pairing: Complements other Simple products like our Hydrating Light Moisturizer for a complete skincare regimen.<\/li><\/ol><\/div><div><br \/><\/div><div>Experience the soothing benefits of Simple Soothing Facial Toner and give your skin the gentle care it deserves. Make a wise choice for a more caring skincare routine \u2013 order now!<\/div>",
                     "Note":"WARNING: For external use only, Avoid getting no your eyes",
                     "ProductWeight":"0.01",
                     "ProductionCountry":"Poland",
                     "Gender":"Unisex",
                     "Season":"All Seasons",
                     "SkinType":"All skin types",
                     "Volume":"200ml"
                  }
               },
               {
                  "SellerSku":"009",
                  "ShopSku":"SI445ST3MMWF2NAFAMZ-402792930",
                  "Name":"Simple Moisturising Facial Wash",
                  "Variation":"White",
                  "ParentSku":"009",
                  "Quantity":"4",
                  "Available":"4",
                  "Price":"5200",
                  "SalePrice":"4900",
                  "SaleStartDate":"2023-09-26 00:00:00",
                  "SaleEndDate":"2024-01-27 00:00:00",
                  "Status":"inactive",
                  "ProductId":"5011451103870",
                  "Url":"http:\/\/www.jumia.com.ng\/262581491.html",
                  "MainImage":"https:\/\/ng.jumia.is\/HGCT1sxRR7TD8Bon2-lG0KBhHUs=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/1.jpg?6495",
                  "Images":{
                     "Image":[
                        "https:\/\/ng.jumia.is\/HGCT1sxRR7TD8Bon2-lG0KBhHUs=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/1.jpg?6495",
                        "https:\/\/ng.jumia.is\/8dBq9IwDLc-glGerDYMUo1EEu7s=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/2.jpg?6495",
                        "https:\/\/ng.jumia.is\/SVGiShOcNTHWdf3dz3geF_R6QIg=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/3.jpg?6495",
                        "https:\/\/ng.jumia.is\/EDTI4UQCt7rLl6jcXExSyLl5wpo=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/4.jpg?6495",
                        "https:\/\/ng.jumia.is\/xtVx0AXvQhjsXJahadDZUbsu3Do=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/5.jpg?6495",
                        "https:\/\/ng.jumia.is\/hufDYl4NuxwguSv-RkkTnVEqUPA=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/6.jpg?6495",
                        "https:\/\/ng.jumia.is\/U3-UVIHvRAjNrNZcM8Q0L1bqvz8=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/7.jpg?6495"
                     ]
                  },
                  "Description":"<div>Discover the secret to smooth and healthy-looking skin with Simple Moisturising Facial Wash. At Simple, we believe in choosing kindness\u2014for your skin, our planet, and people. Our facial wash is not only effective but also planet-friendly, making it the perfect addition to your daily skincare routine.<\/div><div><br \/><\/div><div>This dermatologically-tested facial wash is designed to cleanse and nourish your skin gently. It's free from harsh chemicals that can upset your skin, making it suitable for all skin types, even the most sensitive. With no color, perfume, soap, alcohol, or mineral oil, you can trust that your skin is in safe hands.<\/div><div><br \/><\/div><div>Using Simple Moisturising Facial Wash is easy. Just lather a small amount in your hands, massage it onto wet skin, and rinse thoroughly with water. Follow up with your favorite Simple moisturizer for a complete skincare regimen.<\/div><div><br \/><\/div><div>Our special blend of ingredients, including Vitamin B5, Vitamin E, and Pro Amino Acids, helps your skin become stronger and more resilient with every wash. You'll notice the difference as your skin looks and feels smoother and healthier.<\/div><div><br \/><\/div><div>Join us in choosing kindness for your skin and the environment. Make Simple Moisturising Facial Wash a part of your daily routine and experience the benefits for yourself. Order now and let your skin thrive in the gentle care it deserves.<\/div>",
                  "TaxClass":"default",
                  "Brand":"Simple",
                  "PrimaryCategory":"Exfoliators",
                  "PrimaryCategoryId":"1024367",
                  "ProductData":{
                     "Model":"Simple moisturising facial wash SMOOTH AND HEALTHY LOOKING SKIN",
                     "ProductLine":"Anike Cosmetics",
                     "ShopType":"Jumia Mall",
                     "MainMaterial":"N\/A",
                     "ShortDescription":"<div>Key Highlights of Simple Moisturising Facial Wash:<\/div><div><br \/><\/div><div><ol><li>Smooth and Healthy Skin: Achieve a radiant and healthy complexion with this facial wash.<\/li><li>Planet-Friendly: A skincare choice that's kind to your skin and the environment.<\/li><li>Gentle and Dermatologically Tested: Suitable for all skin types, even sensitive skin, with no harsh chemicals, colors, perfumes, soap, alcohol, or mineral oil.<\/li><li>Easy-to-Use: Simply lather, cleanse, and rinse for a refreshed face.<\/li><li>Nourishing Ingredients: Enriched with Vitamin B5, Vitamin E, and Pro Amino Acids for stronger, more resilient skin.<\/li><\/ol><\/div><div><br \/><\/div><div>Choose the gentle care of Simple Moisturising Facial Wash and experience the beauty of smooth and healthy skin. Elevate your skincare routine today \u2013 order now!<\/div><div><br \/><\/div>",
                     "Note":"WARNING: For external use only. Avoid getting into your eyes.",
                     "ProductWeight":"0.01",
                     "ProductionCountry":"UK",
                     "Gender":"Unisex",
                     "Season":"All Seasons",
                     "SkinType":"All skin types",
                     "Volume":"150ml"
                  }
               },
               {
                  "SellerSku":"010",
                  "ShopSku":"SI445ST3MMWF2NAFAMZ-402792931",
                  "Name":"Simple Moisturising Facial Wash",
                  "Variation":"Clear",
                  "ParentSku":"009",
                  "Quantity":"2",
                  "Available":"2",
                  "Price":"5200",
                  "SalePrice":"4900",
                  "SaleStartDate":"2023-09-26 00:00:00",
                  "SaleEndDate":"2024-01-27 00:00:00",
                  "Status":"inactive",
                  "ProductId":"5011451103863",
                  "Url":"http:\/\/www.jumia.com.ng\/262581491.html",
                  "MainImage":"https:\/\/ng.jumia.is\/HGCT1sxRR7TD8Bon2-lG0KBhHUs=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/1.jpg?6495",
                  "Images":{
                     "Image":[
                        "https:\/\/ng.jumia.is\/HGCT1sxRR7TD8Bon2-lG0KBhHUs=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/1.jpg?6495",
                        "https:\/\/ng.jumia.is\/8dBq9IwDLc-glGerDYMUo1EEu7s=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/2.jpg?6495",
                        "https:\/\/ng.jumia.is\/SVGiShOcNTHWdf3dz3geF_R6QIg=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/3.jpg?6495",
                        "https:\/\/ng.jumia.is\/EDTI4UQCt7rLl6jcXExSyLl5wpo=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/4.jpg?6495",
                        "https:\/\/ng.jumia.is\/xtVx0AXvQhjsXJahadDZUbsu3Do=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/5.jpg?6495",
                        "https:\/\/ng.jumia.is\/hufDYl4NuxwguSv-RkkTnVEqUPA=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/6.jpg?6495",
                        "https:\/\/ng.jumia.is\/U3-UVIHvRAjNrNZcM8Q0L1bqvz8=\/fit-in\/500x500\/filters:fill(white)\/product\/19\/4185262\/7.jpg?6495"
                     ]
                  },
                  "Description":"<div>Discover the secret to smooth and healthy-looking skin with Simple Moisturising Facial Wash. At Simple, we believe in choosing kindness\u2014for your skin, our planet, and people. Our facial wash is not only effective but also planet-friendly, making it the perfect addition to your daily skincare routine.<\/div><div><br \/><\/div><div>This dermatologically-tested facial wash is designed to cleanse and nourish your skin gently. It's free from harsh chemicals that can upset your skin, making it suitable for all skin types, even the most sensitive. With no color, perfume, soap, alcohol, or mineral oil, you can trust that your skin is in safe hands.<\/div><div><br \/><\/div><div>Using Simple Moisturising Facial Wash is easy. Just lather a small amount in your hands, massage it onto wet skin, and rinse thoroughly with water. Follow up with your favorite Simple moisturizer for a complete skincare regimen.<\/div><div><br \/><\/div><div>Our special blend of ingredients, including Vitamin B5, Vitamin E, and Pro Amino Acids, helps your skin become stronger and more resilient with every wash. You'll notice the difference as your skin looks and feels smoother and healthier.<\/div><div><br \/><\/div><div>Join us in choosing kindness for your skin and the environment. Make Simple Moisturising Facial Wash a part of your daily routine and experience the benefits for yourself. Order now and let your skin thrive in the gentle care it deserves.<\/div>",
                  "TaxClass":"default",
                  "Brand":"Simple",
                  "PrimaryCategory":"Exfoliators",
                  "PrimaryCategoryId":"1024367",
                  "ProductData":{
                     "Model":"Simple moisturising facial wash SMOOTH AND HEALTHY LOOKING SKIN",
                     "ProductLine":"Anike Cosmetics",
                     "ShopType":"Jumia Mall",
                     "MainMaterial":"N\/A",
                     "ShortDescription":"<div>Key Highlights of Simple Moisturising Facial Wash:<\/div><div><br \/><\/div><div><ol><li>Smooth and Healthy Skin: Achieve a radiant and healthy complexion with this facial wash.<\/li><li>Planet-Friendly: A skincare choice that's kind to your skin and the environment.<\/li><li>Gentle and Dermatologically Tested: Suitable for all skin types, even sensitive skin, with no harsh chemicals, colors, perfumes, soap, alcohol, or mineral oil.<\/li><li>Easy-to-Use: Simply lather, cleanse, and rinse for a refreshed face.<\/li><li>Nourishing Ingredients: Enriched with Vitamin B5, Vitamin E, and Pro Amino Acids for stronger, more resilient skin.<\/li><\/ol><\/div><div><br \/><\/div><div>Choose the gentle care of Simple Moisturising Facial Wash and experience the beauty of smooth and healthy skin. Elevate your skincare routine today \u2013 order now!<\/div><div><br \/><\/div>",
                     "Note":"WARNING: For external use only. Avoid getting into your eyes.",
                     "ProductWeight":"0.01",
                     "ProductionCountry":"UK",
                     "Gender":"Unisex",
                     "Season":"All Seasons",
                     "SkinType":"All skin types",
                     "Volume":"150ml"
                  }
               }
            ]
         }
      }
   }
}

* */

    public Product(String imageUrl, String name, String price, String id, int unitsAvailable) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.price = price;
        this.id = id;
        this.unitsAvailable = unitsAvailable;
    }

    public Product(String imageUrl, String name, String price, String id, int unitsAvailable, String description) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.price = price;
        this.id = id;
        this.unitsAvailable = unitsAvailable;
        this.description = description;
    }

    public Product() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUnitsAvailable() {
        return unitsAvailable;
    }

    public void setUnitsAvailable(int unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
