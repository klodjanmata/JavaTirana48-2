package JavaFundamentalsCoding.Task19;

public class Main {
    public static void main(String[] args) {
        //Author.printAuthorStatic();
        Author author1 = new Author("Dritero", "Agolli", "Shqiptar");
        Author author2 = new Author("Lasgush", "Poradeci", "Shqiptar");
        Author author3 = new Author("Gjergj", "Fishta", "Shqiptar");

        Poem poem1 = new Poem(author1, "E dashur Sadije", 3, poem1Content());
        Poem poem2 = new Poem(author2, "Poradeci", 3, poem2Content());
        Poem poem3 = new Poem(author3, "Atdheut", 7, poem3Content());
        Poem[] poems = new Poem[] {poem1, poem2, poem3};

        longestPoem(poems).printPoem();

    }

    public static Poem longestPoem(Poem[] poems){
        Poem longest = poems[0];
        for(int i = 1; i < poems.length; i++){
            if (longest.getContent().length() < poems[i].getContent().length()){
                longest = poems[i];
            }
        }
        return longest;
    }

    private static String poem1Content() {
        return "Të dua si jetën time, madje edhe më\n" +
                "shumë\n" +
                "Dëshiroj sinqerisht që unë të vdes dhe ti\n" +
                "të jetosh\n";
    }

    private static String poem2Content() {
        return "Perëndim i vagëlluar mi Liqerin pa kufir\n" +
                "Po përhapet dal-nga-dale një pluhúrë si një hije.\n" +
                "Nëpër Mal e nër Lëndina shkrumb' i natës që po bije,\n" +
                "Duke sbritur që nga qjelli përmi fshat po bëhet fir...\n" +
                "\n" +
                "E kudó krahin' e gjërë më s'po qit as pipëlim:\n" +
                "Në katund kërcet një portë...në Liqer heshtë një lopatë...\n" +
                "Një shqiponjë-e arratisur fluturon në Mal-të-Thatë...\n" +
                "Futet zemra djaloshare mun në fund të shpirtit t'im.\n" +
                "\n" +
                "Tërë fisi, tërë jeta, ra... u dergj... e zuri gjumi...\n" +
                "Zotëroj më katër anë errësira...\n" +
                "Po tashi:\n" +
                "Dyke nisur udhëtimin mes-për-mes nër Shqipëri,\n" +
                "Drini plak e i përrallshëm po mburon prej Shëndaumi...";
    }

    private static String poem3Content(){
        return "N’ty mendoj kur agon drita,\n" +
                "Kur bylbyli mallshëm kndon\n" +
                "N’ty mendoj kur soset dita\n" +
                "Terri botën kur e mblon.\n" +
                "\n" +
                "Veç se ty të shoh un n’andërr,\n" +
                "Veç se ty çuet t’kam n’mendim\n" +
                "Ndër t’vështira ti m’je qandërr,\n" +
                "Për ty leht m’vjen çdo ndëshkim.\n" +
                "\n" +
                "Tjera brigje, fusha, zalle,\n" +
                "Unë kam pa larg tue ba shtek,\n" +
                "E përgjova tjera valle\n" +
                "N’tjera lule syu m’u rrek.\n" +
                "\n" +
                "Por nji fushë ma blerët nuk shtrohet,\n" +
                "Por nji mal ma bukur s’rri.\n" +
                "Ma i kulluem nji lum s’dikohet,\n" +
                "Moj Shqypni porsi i ke ti.\n" +
                "\n" +
                "N’ty ma i bukur lulzon prilli,\n" +
                "Jan ma t’kandshme stin e mot,\n" +
                "N’ty bylbyli pa le Dielli\n" +
                "Kndon ma ambël t’Madhit Zot.\n" +
                "\n" +
                "Pa ty lules s’mi vje era,\n" +
                "Pa ty pema frut nuk m’bjen:\n" +
                "Mue pa ty s’më del prandvera.\n" +
                "Pa ty Dielli nuk m’shkëlxen.\n" +
                "\n" +
                "Dersa t’mundem me ligjrue,\n" +
                "E sa gjall me frymë un jam\n" +
                "Kurr Shqypni s’kam me t’harrue\n" +
                "Edhe n’vorr me t’përmend kam.";
    }

//    public static void main(String[] args) {
//        Author[] authors = new Author[30];
//
//        // Populate the array with 30 real-world authors
//        authors[0] = new Author("William", "Shakespeare", "English");
//        authors[1] = new Author("Jane", "Austen", "English");
//        authors[2] = new Author("Mark", "Twain", "American");
//        authors[3] = new Author("Ernest", "Hemingway", "American");
//        authors[4] = new Author("Gabriel", "García Márquez", "Colombian");
//        authors[5] = new Author("Leo", "Tolstoy", "Russian");
//        authors[6] = new Author("Fyodor", "Dostoevsky", "Russian");
//        authors[7] = new Author("Haruki", "Murakami", "Japanese");
//        authors[8] = new Author("George", "Orwell", "British");
//        authors[9] = new Author("J.K.", "Rowling", "British");
//        authors[10] = new Author("Virginia", "Woolf", "English");
//        authors[11] = new Author("James", "Joyce", "Irish");
//        authors[12] = new Author("Franz", "Kafka", "Czech");
//        authors[13] = new Author("Homer", "Unknown", "Greek");
//        authors[14] = new Author("Herman", "Melville", "American");
//        authors[15] = new Author("Toni", "Morrison", "American");
//        authors[16] = new Author("Emily", "Dickinson", "American");
//        authors[17] = new Author("Edgar", "Allan Poe", "American");
//        authors[18] = new Author("Charles", "Dickens", "English");
//        authors[19] = new Author("Johann Wolfgang", "von Goethe", "German");
//        authors[20] = new Author("Margaret", "Atwood", "Canadian");
//        authors[21] = new Author("Chinua", "Achebe", "Nigerian");
//        authors[22] = new Author("Isabel", "Allende", "Chilean");
//        authors[23] = new Author("Italo", "Calvino", "Italian");
//        authors[24] = new Author("Jorge Luis", "Borges", "Argentine");
//        authors[25] = new Author("Albert", "Camus", "French");
//        authors[26] = new Author("Marcel", "Proust", "French");
//        authors[27] = new Author("Sylvia", "Plath", "American");
//        authors[28] = new Author("Khaled", "Hosseini", "Afghan-American");
//        authors[29] = new Author("Elif", "Shafak", "Turkish-British");
//
//        for (Author author : authors) {
//            author.printAuthor();
//        }
//
////        for(int i = 0; i < authors.length; i++){
////            authors[i].printAuthor();
////        }
//    }
}
