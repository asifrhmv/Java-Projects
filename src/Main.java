import java.util.*;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> users=new ArrayList<>();
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            System.out.println((i+1)+".Ad:");
//            String ad=sc.nextLine();
//                 users.add(ad);
//        }
//
//        System.out.println("\n Daxil edilen istifadeciler:");
//
//        for(String a:users){
//            System.out.println(a);
//        }

//        ArrayList<String>users=new ArrayList<>();
//        users.add("Asif");
//        users.add("Nubar");
//        users.add("Rena");
//        users.add("Azer");
//        users.add("Togrul");
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Bir eded daxil edin:");
//        int eded=sc.nextInt();
//        System.out.println("Daxil etdiyiniz indeksdeki User:"+users.get(eded));

//        ArrayList<String>users=new ArrayList<>();
//        users.add("Asif");
//        users.add("Nubar");
//        users.add("Rena");
//        users.add("Azer");
//        users.add("Togrul");
//
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Eded daxil edin:");
//        int eded=sc.nextInt();
//        sc.nextLine();
//        System.out.print("Ad daxil edin:");
//String ad=sc.nextLine();
//
//users.set(eded,ad);
//
//        System.out.println(users);

//        ArrayList<String>users=new ArrayList<>();
//        users.add("Asif");
//        users.add("Nubar");
//        users.add("Rena");
//        users.add("Azer");
//        users.add("Togrul");
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Silmek istediyiniz adi yazin:");
//        String ad=scan.nextLine();
//
//        users.remove(ad);
//
//        System.out.println(users);

//        ArrayList<String>users=new ArrayList<>();
//        users.add("Asif");
//        users.add("Nubar");
//        users.add("Rena");
//        users.add("Azer");
//        users.add("Togrul");
//
//Scanner  scan=new Scanner(System.in);
//        System.out.println("Yoxlamaq istediyiniz adi daxil edin :");
//        String ad=scan.nextLine();
//
//        if (users.contains(ad)){
//            System.out.println("Ad siyahida tapildi !");
//        }
//        else {
//            System.out.println("Ad siyahida tapilmadi !");
//        }

//        ArrayList<String>users=new ArrayList<>();
//        users.add("Asif");
//        users.add("Nubar");
//        users.add("Rena");
//        users.add("Azer");
//        users.add("Togrul");
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Indeksini tapmaq istediyiniz ad:");
//        String ad=scan.nextLine();
//
//        System.out.println("Adin indeksi: "+users.indexOf(ad));


//        ArrayList<String>users=new ArrayList<>();
//        users.add("Asif");
//        users.add("Nubar");
//        users.add("Rena");
//        users.add("Azer");
//        users.add("Togrul");
//
//
//        System.out.println(users.size());
//
//        users.add("Umud");
//        users.add("Murad");
//
//        System.out.println(users.size());


//        LinkedList<String>users=new LinkedList<>();
//        users.add("Asif");
//        users.add("Nubar");
//        users.add("Gunay");
//        users.add("Rena");
//        users.add("Azer");
//        users.addFirst("Togrul");
//        users.addLast("Umud");
//
//
//        System.out.println(users.getFirst());
//        System.out.println(users.getLast());
//users.remove(4);
//        System.out.println(users);

//        Queue<String> queue=new LinkedList<>();
//queue.offer("Asif");
//queue.offer("Nubar");
//queue.offer("Azer");
//queue.offer("Gunay");
//
//        System.out.println("Novbede olan mushteri:"+queue.peek());
//        System.out.println("Xidmet gosterilen:"+queue.poll());
//        System.out.println("Umumi novbe:"+queue);


//PriorityQueue<Integer> pq=new PriorityQueue<>();
//pq.offer(20);
//pq.offer(30);
//pq.offer(10);
//pq.offer(40);
//
//pq.peek();
//
//pq.poll();
//        System.out.println(pq);
//

//        PriorityQueue<Musteri> pq=new PriorityQueue<>(new MusteriComparator());
//pq.offer(new Musteri("Asif",1));
//pq.offer(new Musteri("Umud",4));
//pq.offer(new Musteri("Murad",3));
//pq.offer(new Musteri("Xeyal",2));
//
//while(!pq.isEmpty()){
//    System.out.println("Xidmet gosterilir:"+pq.poll());
//}

//ArrayList<String>users=new ArrayList<>();
//users.add("Asif");
//users.add("Umud");
//users.add("Azer");
//users.add("Murad");
//users.add("Emin");
//
//Scanner scan=new Scanner(System.in);
//        System.out.println("Silmek istediyiniz adi yazin:");
//        String ad=scan.nextLine();
//        if(users.contains(ad)){
//            users.remove(ad);
//        }
//        else{
//            System.out.println("Ad tapilmadi !");
//        }
//
//        System.out.println(users);

//       LinkedList<String>users=new LinkedList<>();
//
//        users.add("Asif");
//        users.add("Umud");
//        users.add("Azer");
//        users.add("Murad");
//        users.add("Emin");
//
//        users.addFirst("Amil");
//        users.addLast("Shamil");
//
//users.remove("Murad");
//
//        System.out.println(users);


//        Queue<String>users=new LinkedList<>();
//        users.offer("Asif");
//        users.offer("Azer");
//        users.offer("Umud");
//        users.offer("Murad");
//
//        System.out.println("Novbedeki user:"+users.peek());
//        System.out.println("Xidmet gosterilen:"+users.poll());
//        System.out.println("Hal hazirdaki novbe:"+users);


//PriorityQueue<String>pq=new PriorityQueue<>();
//pq.offer("Asif");
//pq.offer("Amil");
//pq.offer("Murad");
//pq.offer("Azer");
//pq.offer("Altun");
//pq.offer("Babek");
//
//
//        System.out.println("Novbedeki user:"+pq.peek());
//        System.out.println("Xidmet gosterilen:"+pq.poll());
//        System.out.println("Hal hazirdaki novbe:"+pq);


//Musteri m1=new Musteri("Asif",1);
//Musteri m2=new Musteri("Azer",2);
//Musteri m3=new Musteri("Umud",3);
//Musteri m4=new Musteri("Murad",4);
//
//ArrayList<Musteri>musteri=new ArrayList<>();
//musteri.add(m1);
//musteri.add(m2);
//musteri.add(m3);
//musteri.add(m4);
//
//        System.out.println(musteri);


//        PriorityQueue<Musteri>pq=new PriorityQueue<>(new MusteriComparator());
//
//        pq.offer(new Musteri("Asif",1));
//        pq.offer(new Musteri("Azer",4));
//        pq.offer(new Musteri("Umud",2));
//        pq.offer(new Musteri("Murad",3));
//
//        System.out.println("Novbedeki mushteri:"+pq.peek());
//        System.out.println("Xidmet gosterilen mushteri:"+pq.poll());
//        System.out.println("Umumi novbe:"+pq);


//HashSet<String>users=new HashSet<>();
//Scanner scan=new Scanner(System.in);
//        System.out.println("5 eded istifadeci daxil edin !");
//int i=0;
//while(i<5){
//    String ad=scan.nextLine();
//    if(users.contains(ad)){
//        System.out.println("Istifadeci artiq qeyd olunub !");
//    }
//    else {
//        users.add(ad);
//        System.out.println("Qeydiyyat ugurla tamamlandi !");
//        i++;
//    }
//
//}
//
//        System.out.println(users);

//        LinkedHashSet<String>users=new LinkedHashSet<>();
//        Scanner scan=new Scanner(System.in);
//        System.out.println("5 eded istifadeci daxil edin !");
//        int i=0;
//        while(i<5){
//            String ad=scan.nextLine();
//            if(users.contains(ad)){
//                System.out.println("Istifadeci artiq qeyd olunub !");
//            }
//            else {
//                users.add(ad);
//                System.out.println("Qeydiyyat ugurla tamamlandi !");
//                i++;
//            }
//
//        }
//
//        System.out.println(users);


//        TreeSet<Integer>ballar=new TreeSet<>();
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Telebelerin ballarini daxil edin:");
//        int i=0;
//        while(i<5){
//            int bal=scan.nextInt();
//            if(ballar.contains(bal)){
//                System.out.println("Bal artiq daxil edilib !");
//            }
//            else{
//                ballar.add(bal);
//                System.out.println("Bal ugurla elave edildi !");
//                i++;
//            }
//        }
//
//        System.out.println("Umumi ballar:"+ballar);
//        System.out.println("Maksimum bal:"+ballar.last());
//        System.out.println("Minimum bal:"+ballar.first());
//----------------------------------------------------------------------------------------------

//        HashSet<String>users=new HashSet<>();
//        Scanner scan=new Scanner(System.in);
//        System.out.println("10 eded ad daxil edin:");
//        int i=0;
//        while(i<10){
//            System.out.println("Adi daxil edin:");
//            String ad=scan.nextLine();
//            if(users.contains(ad)){
//                System.out.println("Ad artiq daxil edilib !");
//            }
//            else{
//                users.add(ad);
//                System.out.println("Qeydiyyat ugurla tamamlandi !");
//                i++;
//            }
//
//
//        }
//
//        System.out.println(users);



//        LinkedHashSet<String>users=new LinkedHashSet<>();
//        Scanner scan=new Scanner(System.in);
//        System.out.println("10 eded ad daxil edin:");
//        int i=0;
//        while(i<10){
//            System.out.println("Adi daxil edin:");
//            String ad=scan.nextLine();
//            if(users.contains(ad)){
//                System.out.println("Ad artiq daxil edilib !");
//            }
//            else{
//                users.add(ad);
//                System.out.println("Qeydiyyat ugurla tamamlandi !");
//                i++;
//            }
//
//
//        }
//
//        System.out.println(users);


//        Scanner scan=new Scanner(System.in);
//        TreeSet<Integer>ballar=new TreeSet<>();
//        int i=0;
//        System.out.println("Telebelerin ballarini daxil edin:");
//        while(i<7){
//            System.out.println("Bali daxil edin:");
//            int bal= scan.nextInt();
//            scan.nextLine();
//            if(ballar.contains(bal)){
//                System.out.println("Bal artiq daxil edilib !");
//            }
//            else{
//                System.out.println("Qeydiyyat ugurla tamamlandi !");
//                ballar.add(bal);
//                i++;
//            }
//        }
//
//        System.out.println("Umumi ballar:"+ballar);
//        System.out.println("Minimum bal:"+ballar.first());
//        System.out.println("Maksimum bal:"+ballar.last());


//        TreeSet<String>users=new TreeSet<>();
//        Scanner scan=new Scanner(System.in);
//        System.out.println("10 eded ad daxil edin:");
//        int i=0;
//        while(i<10){
//            System.out.println("Adi daxil edin:");
//            String ad=scan.nextLine();
//            if(users.contains(ad)){
//                System.out.println("Ad artiq daxil edilib !");
//            }
//            else{
//                users.add(ad);
//                System.out.println("Qeydiyyat ugurla tamamlandi !");
//                i++;
//            }
//
//
//        }
//
//        System.out.println(users);

//--------------------------------------------------------------------------------------

// HashMap<String,Integer> students=new HashMap<>();
//
//Scanner scan=new Scanner(System.in);
//int i=0;
//while(i<5){
//    System.out.println("Telebenin adini daxil edin :");
//    String ad=scan.nextLine();
//    System.out.println("Telebenin balini daxil edin :");
//    int bal=scan.nextInt();
//    scan.nextLine();
//    if(students.containsKey(ad) && students.containsValue(bal)){
//        System.out.println("Telebe ve bal artiq daxil edilib !");
//    }
//    else {
//        System.out.println("Qeydiyyat ugurla tamamlandi !");
//        students.put(ad,bal);
//        i++;
//    }
//}
//        System.out.println("Balini oyrenmek istediyiniz telebnin adini daxil edin !");
//        String yoxla=scan.nextLine();
//        if(!students.containsKey(yoxla)){
//            System.out.println("Bu adda telebe tapilmadi !");
//        }
//        else {
//            System.out.println("Daxil etdiyiniz telebenin bali: "+students.get(yoxla));
//        }
//
//
//List<Map.Entry<String,Integer>>siyahi=new ArrayList<>(students.entrySet());
//
//siyahi.sort((e1,e2)-> e2.getValue()- e1.getValue());
//
//        System.out.println("Reytinq siyahisi :");
//for(Map.Entry<String,Integer>entry:siyahi){
//    System.out.println(entry.getKey()+"->"+entry.getValue());
//}

//        HashMap<String,Integer>workers=new HashMap<>();
//        Scanner scan=new Scanner(System.in);
//        int i=0;
//        while(i<10){
//            System.out.println("Ishchinin adini daxil edin:");
//            String ad=scan.nextLine();
//            System.out.println("Ishchinin maashini daxil edin: ");
//            int maash=scan.nextInt();
//            scan.nextLine();
//            if(workers.containsKey(ad)){
//                System.out.println("Ad daha once daxil edilib !");
//            }
//            else if(workers.containsValue(maash)){
//                System.out.println("Maash daha once daxil edilib !");
//            }
//
//            else{
//                workers.put(ad,maash);
//                i++;
//            }
//        }
//
//        List<Map.Entry<String,Integer>>rating=new ArrayList<>(workers.entrySet());
//        rating.sort((e1,e2)->e2.getValue()-e1.getValue());
//
//        System.out.println("Maash uzre reytinq siyahisi:");
//        for(Map.Entry<String,Integer>entry:rating){
//            System.out.println(entry.getKey()+"->"+entry.getValue());
//        }

//        HashMap<String,Integer>meyveler=new HashMap<>();
//        Scanner scan=new Scanner(System.in);
//        int i=0;
//        while(i<5){
//            System.out.println("Meyvenin adini daxil edin:");
//            String meyve=scan.nextLine();
//            System.out.println("Meyvenin qiymetini daxil edin:");
//            int qiymet=scan.nextInt();
//            scan.nextLine();
//            if(meyveler.containsKey(meyve)){
//                System.out.println("Meyve daha once daxil edilib !");
//            } else if (meyveler.containsValue(qiymet)) {
//                System.out.println("Qiymet daha once daxil edilib !");
//            }
//            else{
//                meyveler.put(meyve,qiymet);
//                i++;
//            }
//        }
//
//        List<Map.Entry<String,Integer>>siyahi=new ArrayList<>(meyveler.entrySet());
//        siyahi.sort((e1,e2)->e2.getValue()-e1.getValue());
//
//        System.out.println("Meyvelerin qiymet cedveli:");
//
//        for (Map.Entry<String,Integer>entry:siyahi){
//            System.out.println(entry.getKey()+" -> "+entry.getValue());
//        }
//
//        Map.Entry<String,Integer>maxMeyve=siyahi.get(0);
//        Map.Entry<String,Integer>minMeyve=siyahi.get(siyahi.size()-1);
//        System.out.println("En baha meyve ve qiymeti: "+maxMeyve.getKey()+" -> "+maxMeyve.getValue());
//        System.out.println("En ucuz meyve ve qiymeti: "+minMeyve.getKey()+" -> "+minMeyve.getValue());


//        TreeMap<String,Integer>workers=new TreeMap<>();
//        Scanner scan=new Scanner(System.in);
//        int i=0;
//        while(i<5){
//            System.out.println("Ishcinin adini daxil edin :");
//            String ad=scan.nextLine();
//            System.out.println("Ishcinin maashini daxil edin:");
//            int maash=scan.nextInt();
//            scan.nextLine();
//            if(workers.containsKey(ad)){
//                System.out.println("Ishci artiq daxil edilib");
//            }
//            else if (workers.containsValue(maash)){
//                System.out.println("Maash artiq daxil edilib:");
//            }
//            else{
//                workers.put(ad,maash);
//                i++;
//            }
//        }
//
//        List<Map.Entry<String,Integer>>siyahi=new ArrayList<>(workers.entrySet());
//        siyahi.sort((e1,e2)->e2.getValue()-e1.getValue());
//
//        System.out.println("Ishcilerin maash uzre siralamasi:");
//        for (Map.Entry<String,Integer>entry:siyahi){
//            System.out.println(entry.getKey()+" -> "+entry.getValue());
//        }
//
//        Map.Entry<String,Integer>maxWorker=siyahi.get(0);
//        Map.Entry<String,Integer>minWorker=siyahi.get(siyahi.size()-1);
//
//        System.out.println("Maksimum maash alan ishci:"+maxWorker.getKey()+" -> "+maxWorker.getValue());
//
//        System.out.println("Minimum maash alan ishci:"+minWorker.getKey()+" -> "+minWorker.getValue());


//   List<Integer>nums=new ArrayList<>(Arrays.asList(12,45,8,23,14,7));
//
////   nums.sort(Comparator.naturalOrder());
//        nums.sort(Comparator.reverseOrder());
////        Collections.sort(nums);
//
//        System.out.println(Collections.max(nums));
//        System.out.println(Collections.min(nums));
//
//        Collections.shuffle(nums);
//
//        System.out.println(nums);


//List<String>students=new ArrayList<>(Arrays.asList("Asif","Azer","Murad","Azer","Asif","Rena","Togrul"));
//
////for(String e:new HashSet<>(students)){
////    System.out.println(e+" Adi "+Collections.frequency(students,e)+" defe tekrarlanir !");
////}
//
////        Collections.replaceAll(students,"Asif","Asif Rehimov");
////        Collections.reverse(students);
////Collections.swap(students,0,students.size()-1);
////        Collections.shuffle(students);
////Collections.fill(students,"Telebe");
//        System.out.println(students);


//    List<String>products=new ArrayList<>(Arrays.asList("Chorek","Sud","Yumurta","Pendır","Kere yagi"));
//    List<String>bckupProducts=new ArrayList<>(Collections.nCopies(products.size(),""));
//
//Collections.copy(bckupProducts,products);
//Collections.replaceAll(products,"Pendır","Pendir");
//        System.out.println(products);
//        System.out.println(bckupProducts);


//Collections.shuffle(products);
////        Collections.reverse(products);
//        List<String>products=new ArrayList<>(Arrays.asList("Chorek", "Sud", "Yumurta", "Pendır", "Kere yagi",
//                "Makaron", "Qend", "Chay", "Kofe", "Duz", "Chay", "Sud", "Chay"));
//
////
////        int i=1;
////        int maxCount=Collections.frequency(products,products.get(0));
////        String max=products.get(0);
////        while(i<products.size()){
////            if(Collections.frequency(products,products.get(i))>maxCount){
////                max=products.get(i);
////                maxCount=Collections.frequency(products,products.get(i));
////            }i++;
////        }
////
////        System.out.println("En chox tekrarlanan:"+max+" "+maxCount+" defe !");
//
////        int maxCount=0;
////        String maxRepeat="";
////
////        Set<String>unique=new HashSet<>(products);
////        for(String product:unique){
////            int count=Collections.frequency(products,product);
////            if(count>maxCount){
////                maxCount=count;
////                maxRepeat=product;
////            }
////        }
////
////        System.out.println("En chox tekrarlanan:"+maxRepeat+" "+maxCount+" defe !");
//
////Collections.replaceAll(products,"Pendır","Pendir");
//
////Collections.swap(products,0,products.size()-1);
//
////        List<String>bckupProd=new ArrayList<>(Collections.nCopies(products.size(),""));
////
////        Collections.copy(bckupProd,products);
//
//
//        Collections.fill(products,"Silinib ");
//
//        System.out.println(products);

    }
}