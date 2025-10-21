import java.util.Scanner;
class spotify
{
	public static void main(String [] args)
	{
		Scanner user=new Scanner(System.in);
		
		System.out.println("*******************************************");
		System.out.println("SPOTIFY WELCOMES YOU");
		System.out.println("Select your Options, The Options Are :");
		
		System.out.println("1. A.R. RAHMAN");
		System.out.println("2. ANIRUTH");
		System.out.println("3. HARISH JEYARAJ");
		System.out.println("4. ILLAIYARAJA");
		System.out.println("5. U1");
		
		System.out.println("---------------------------------------------");
		int singer=user.nextInt();
		
		if(singer==1)
		{
			System.out.println("A.R. RAHMAN");
			
			
			System.out.println("1.Melody Songs");
			System.out.println("2.Kuthu Songs");
			System.out.println("3.Motivational Songs");
			System.out.println("4.Sad Songs");
			
			System.out.println("Choose your Opinion");
			int menuchoose=user.nextInt();
			System.out.println("---------------------------------------------");
			if(menuchoose==1)
			{
				System.out.println("Netru Illadha Matram");
				System.out.println("Enna Solla Pogirai");
				System.out.println("Ennavale Adi Ennavale");
				System.out.println("Malargale Malargale");
			}
			else if(menuchoose==2)
			{
				System.out.println("Thaiya Thaiya");
				System.out.println("Mukkala Mukkabala");
				System.out.println("Urvashi Urvashi");
				System.out.println("Aathichudi");
			}
			else if(menuchoose==3)
			{
				System.out.println("Vande Mataram");
				System.out.println("Oruvan Oruvan Mudhalali");
				System.out.println("Shakthi kodu");
				System.out.println("Kappal Yeari Poyachu");
			}
			else if(menuchoose==4)
			{
				System.out.println("Poongatrile");
				System.out.println("Marudhani");
				System.out.println("Rasathi");
				System.out.println("Oru Poiyava Sol");
			}
		}
		
		else if(singer==2)
		{
			System.out.println("ANIRUTH");
			
			
			System.out.println("1.Melody Songs");
			System.out.println("2.Kuthu Songs");
			System.out.println("3.Motivational Songs");
			System.out.println("4.Sad Songs");
			
			System.out.println("Choose your Opinion");
			int menuchoose=user.nextInt();
			System.out.println("---------------------------------------------");
			if(menuchoose==1)
			{
				System.out.println("Neeyum Nanum Anbe");
				System.out.println("Velicha Poove");
				System.out.println("Po Indru Neeyaga");
				System.out.println("Nee Partha Vizhigal");
			}
			else if(menuchoose==2)
			{
				System.out.println("Vathi Raid");
				System.out.println("Naa Ready");
				System.out.println("Badass");
				System.out.println("Vantha Edam");
			}
			else if(menuchoose==3)
			{
				System.out.println("Velai Illa Pattadhari");
				System.out.println("Boomi Enna Suthudhe");
				System.out.println("Ethir Neechal");
				System.out.println("Surviva");
			}
			else if(menuchoose==4)
			{
				System.out.println("Porkanda Singam");
				System.out.println("Kanave kanave");
				System.out.println("Kannana Kanne");
				System.out.println("Jodi Nilave");
			}
		}
		
		
		else if(singer==3)
		{
			System.out.println("HARISH JEYARAJ");
			
			
			System.out.println("1.Melody Songs");
			System.out.println("2.Kuthu Songs");
			System.out.println("3.Sad Songs");
			
			System.out.println("Choose your Opinion");
			int menuchoose=user.nextInt();
			System.out.println("---------------------------------------------");
			if(menuchoose==1)
			{
				System.out.println("Unnale");
				System.out.println("Annul Mele");
				System.out.println("yedho Ondru");
				System.out.println("Vaseegara");
			}
			else if(menuchoose==2)
			{
				System.out.println("Thirunalveli Halwa da");
				System.out.println("Aradi Katre");
				System.out.println("Soda Battle");
				System.out.println("Aruva Meesai");
			}
			else if(menuchoose==3)
			{
				System.out.println("Venmadhiye");
				System.out.println("Oh Maname");
				System.out.println("Yemma yemma");
				System.out.println("Othayile");
			}
		}
		
		
		else if(singer==4)
		{
			System.out.println("ILLAIYARAJA");
			
			
			System.out.println("1.Melody Songs");
			System.out.println("2.Kuthu Songs");
			System.out.println("3.Sad Songs");
			
			System.out.println("Choose your Opinion");
			int menuchoose=user.nextInt();
			System.out.println("---------------------------------------------");
			if(menuchoose==1)
			{
				System.out.println("Oru Kili Uruguthu");
				System.out.println("Kuzhaloondhum kannanukku");
				System.out.println("Ennai Thottu");
				System.out.println("Raja Raja cholan");
			}
			else if(menuchoose==2)
			{
				System.out.println("Ooravittu Ooruvandhu");
				System.out.println("Nooru Varushm");
				System.out.println("Aasai Nooruvagai");
				System.out.println("Aasai Athigam Vachi");
			}
			else if(menuchoose==3)
			{
				System.out.println("Kanne Kalaimane");
				System.out.println("Thene Thenpandi Neeye");
				System.out.println("Paadi Partha kili");
				System.out.println("Nilave Vaa");
			}
		}
		
		
		else if(singer==5)
		{
			System.out.println("U1");
			
			
			System.out.println("1.Melody Songs");
			System.out.println("2.Kuthu Songs");
			System.out.println("3.Motivational Songs");
			System.out.println("4.Sad Songs");
			
			System.out.println("Choose your Opinion");
			int menuchoose=user.nextInt();
			System.out.println("---------------------------------------------");
			if(menuchoose==1)
			{
				System.out.println("Aathadi Manusuthan");
				System.out.println("Chinna Sirisu");
				System.out.println("Venmegam ");
				System.out.println("Layyayyo");
			}
			else if(menuchoose==2)
			{
				System.out.println("Machi Open The Battle");
				System.out.println("Sarja Saman Nikalo");
				System.out.println("No Money No Honey");
				System.out.println("Villaiyadu Mangatha");
			}
			else if(menuchoose==3)
			{
				System.out.println("Ethirthu Nill");
				System.out.println("Oru Nalil");
				System.out.println("Nimirndhu Nil");
				System.out.println("Ungakulle Mirugam");
			}
			else if(menuchoose==4)
			{
				System.out.println("Kathal Valarthan");
				System.out.println("Yedho Ondru Ennai");
				System.out.println("Pogathe");
				System.out.println("Ninaithu Nianaithu");
			}
		}
		
		System.out.println("*******************************************");
	}
	
}