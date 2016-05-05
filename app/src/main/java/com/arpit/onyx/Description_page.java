package com.arpit.onyx;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Locale;

public class Description_page extends Fragment {
	int m1=0,m2=0,posi;
	
	/*String[][] problemstatement={{"Java guru is a technical event where one's coding capability in java language will be tested. Along with the proper knowledge of coding terms, a brain with good logical approach will be needed to get through the event."},
			 					  {"The PRESSURE PICASSO is an event in which a hydraulic arm has to be made. The arm will be made using syringes, ice-cream sticks, pipes, solenoid, battery, etc. Each team is required to bring its own model i.e. the hydraulic arm and thus have to perform the task in a specified time."}};
	 String[][] description={{"ROUND 1: "+"\n"+" The first round being quiz where individuals will be tested on questions based on core java concept and syntax of java. A 30 min MCQ quiz will be the next part of the round."+"\n"+"ROUND 2:"+"\n"+"This round would test participants programming skills. Qualifiers from the first round will have to answer 7 questions in duration of an hour using their java skills.","DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 
	 
	 String[][] rules={{"There must be one member in a team."+"\n"+"A member can be of different college."+"\n"+"No need to carry their own resource such as pc, we’ll provide you. ."+"\n"+"Two rounds will be held."+"Round1 :- Is the objective round where participating member answer the question"+" \n"+"Round2:- Is the objective round where participating member perform the operation of java language."+" \n"+"Limited time will be given for doing the task."+" \n"+"Members will be eliminated after first round."+" \n"+"Participants are not allowed to take help from internet or any other resource.","DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 
	 String[][] coordinator={{"ANKIT VERMA"+"\n"+"MARUSHI SHARMA ","DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 String[][] coordinator_no={{"8826947172-8009830073","DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 Integer[] eventpic = {
		      R.drawable.meta1,R.drawable.meta2,R.drawable.meta3,R.drawable.meta4,R.drawable.meta5,R.drawable.meta6,R.drawable.meta7,R.drawable.meta8
		      };
	 String[][] events_title={{"Introduction","description","Rules","Coordinator"},{"Introduction","description","Rules","Bot","Coordinator"},{"DESIGN","FRAG","XQUIZITE","INNOVATE","BRAIN BLOGGER","CODING/DECODING","ROBOTICS"}};
	 
	 public static Description_page newInstance() {
			return new Description_page();
		}
		
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle args) {
	    	//setContentView(R.layout.activity_my_main);
		View view1;
		int i;

	    
 	   view1 = inflater.inflate(R.layout.activity_my_main, container, false);
 ListView view=(ListView)view1.findViewById(R.id.listView1);
	       view.setBackgroundColor(Color.BLACK
	    		   );
	       int posi=getArguments().getInt("POSI");
	       int m1=(posi/10);
	       int m2=posi%10;
	       String[] title=new String[events_title[m1].length];
		    String[] contents=new String[events_title[m1].length];;
		    Integer[] imageId;
		    
	       for(i=0;i<events_title[m1].length;i++)
	       {
	    	   title[i]=events_title[m1][i];
	 if(i==0)      {
	       contents[i]=problemstatement[m1][m2];}
	 else if(i==1)      {
		       contents[i]=description[m1][m2];}
	 else if(i==2)      {
		   contents[i]=rules[m1][m2];}
	 else if(i==3)      {
		   contents[i]=coordinator[m1][m2];}
	}
	        
	     imagecustom4 adapter = new
   	        imagecustom4(getActivity(),title,contents, eventpic);
   	/* final imagecustom adapter1 = new
   	        imagecustom(raceingpart.this, contacts3, imageId);
   	/
		view.setAdapter(adapter);
		
   	registerForContextMenu(view);
   	//view.setOnItemClickListener(clickb);    	
	return view1;
	}
	}
*/
	SectionsPagerAdapter mSectionsPagerAdapter;

	public static final String TAG = Description_page.class.getSimpleName();
	String[][] events_title=
			{
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules",  "Syllabus", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
					{"Introduction", "Rules", "Registration Fee ", "Coordinator"}
			};
//	 String[][] problemstatement=
//			 						  {
//			 							  {
//			 							   "You get to create a superhero out of your imagination as well their strengths and their weakness as well. They could be a combo of ironman with the game tactics of Garfield, because well, the sky is the limit! We’re looking to be blown away by the literary acumen and the rampant imagination.",
//			 							   "1. This is an individual event.\n" +
//												   "\n" +
//												   "2. You have to create your own superhero.\n" +
//												   "\n" +
//												   "3. The superhero should have a definite story. His/her strengths, weaknesses, a background story that turned him into superhero, his/her nemesis and anything else you can think of. The superhero may or may not be an earthling. We are simply looking to be blown away by your imagination.\n" +
//												   "\n" +
//												   "4. You have to take utmost care of originality. The name, dress, appearance, attributes - everything associated with your superhero has to be altogether new and 'never-seen-before'. Yet it has to be believable.\n" +
//												   "\n" +
//												   "5. The storyline has to be simple, concise and most importantly convincing. The reader should be able to relate to it. The characters should tend to communicate with the reader keeping him engrossed.\n" +
//												   "\n" +
//												   "6. You need to submit your write-up at least one day prior to the day of the event for assessment, i.e., the deadline is 10th Feb 2016. You have to mail it to us at onyxgalgotiaslitfest@gmail.com in docx format.",
//			 							   "₹50",
//			 							   "Raaj: +918252378008"
//			 							  },
//			 							  {
//	 										"Mathematics is the language of nature. God used beautiful mathematics in creating the world. Without mathematics, there’s nothing you can do. Everything around you is mathematics. Everything around you is numbers. It is a play that starts with ‘zero’ and tends to infinity. Mathematics has beauty and romance. It’s not a boring place to be, the mathematical world. It’s an extraordinary place; it’s worth spending time there. \n Here is an opportunity in METACOGNITION’15 to play with Mathematics. We invite you to participate in “AMUSING MATH�? and test your mathematical skills.",
//	 										"This event can be participated by a team of two or individually. The event comprises of 3 rounds. \n \n ROUND 1:\n This round consists of 30 objective type questions. Each team will be given only 30 minutes time. Each write answer will give you 3 marks and 1 mark will be deducted for every wrong answer. No mark will be given or deducted for not answering the question. \n In this round, the questions will test your basic mathematics, reasoning capabilities, ‘General Knowledge’ of Mathematics, Mathematicians etc.\n The top 20% – 25% Teams will be taken into the second round. \n ROUND 2: \n This is a puzzle round where the teams are supposed to solve Mathematical puzzles in the given time. The top few teams will be finalized in this round. \nROUND 3: \n This round will consist of 5 subjective questions. Step marking will be done in this round. The team to get maximum marks wins. \n",
//	 										"₹100 per team",
//	 										"Kushagra Sharan: +919540440479 \n Kumar Shubham: +918588820627"
//			 							  }
//			 						  ,
//
//			 							 {
//			 								 "Crazy about spellings: Check \n Proclaims to be a grammar nazi: Check\n Pro at pronunciations : Check \n Hey, you – Mr.Ross Gellar. \n In this fray among the best of bests, lets see who sets the stage ablaze. \nLights. Camera. Fire. WORDS. \n And as the flame of the grammar nazis’ scorches the skies in this war of words, we welcome you to the battle of Spellathon, at Metacognition’15. See you there!",
//			 								 "•The pronouncer will pronounce the word and the speller has to spell it. It is to be noted that the speller is expected to pronounce the word before spelling it so that the pronouncer can be assured that the speller heard it right. Also, after spelling the word, the speller will be expected to again pronounce it so that the judges can know that the speller is done.\n•The speller may ask the pronouncer to pronounce the word again, define it or use it in a sentence. Judges may disqualify any speller who ignores the request to start spelling.\n•Having started to spell a word, a speller may stop and start over, retracing the spelling from the beginning. But during this course, the speller is not allowed to change the sequence of the letters from those, first spelled. So, a speller cannot correct himself or herself, even while it is still his or her turn.\n•The contest will be conducted in rounds. Each speller, remaining in each round will spell one word in the round, except when there are two spellers remaining.\n•If a word has one or more homonyms, the pronouncer will indicate which word is to be spelled, either by defining it or by using it in a sentence. If the pronounced word is not properly identified by the speller, correct spelling of any homonym of the word will be accepted.\n•When the number of spellers are reduced to two, the rule changes. When one speller misspells a word, the other speller will get the opportunity to spell the same word. If the second speller spells that word correctly and the next word on the pronouncer’s list, the second speller shall be the winner.\n•If the second speller is unable to spell the word, the word is again passed on to the first speller. If he or she spells the word passed and the word given to him or her on his own turn, then the first speller will be declared as the winner. If both the spellers, misspell the word, then another round takes place as earlier discussed.\n•Protest may be filed by anyone wishing to reinstate a speller into the contest but will not be heard from \n•any individual seeking to dislodge another speller from the competition. Deadline for filing a protest is before the speller affected would have received his or her word and he or she stayed into the contest.\n•Protest should be verbally made to a designated person immediately or upon completion of a round.\n•Judges are the controller of the contest. Their decisions are final.\n•Please have fun and relax.",
//			 								 "INR 30 PER HEAD",
//			 								 "Ronit: +918004084550"
//			 							  },
//	 									 {
//			 								  "Are you spontaneous enough to face the grammar Nazis, the chatter boxes and the I-Do-Not-Stammer-At-All sorts in a battle of two minute? Well, if yes, come and fight it out among a medley of people in this battle of wits and brains at our impromptu gig, Extempore.",
//			 								  "Each participant will be given a total time of two minutes. One minute for introspecting the topic and the other one minute for speaking. Contestants will have to speak on the topic without hesitation, stammering and repetition. Speakers at all times must be grammatically and factually correct and must speak within the confines of the given topic. A small bell will ring after 45 seconds of the speaking time. The speaking time will include a brief introduction of the speaker. \n A second round can take place, if there is a tie between two speakers. The decision of the organising committee is final, in case of any dispute.",
//			 								  "•English should be the language of communication \n •Speech notes are not permitted during the time of the speech. Cue and palm cards are however permitted. However, their use should not hamper the speaker’s visual engagement with the audience. \n•Participants must carry their own pens.\n •Discipline is of prime importance.",
//			 								  "Rs 50 PER HEAD",
//			 								  "Soman- +918527787397 \n Siddharth: +918287683957"
//			 							},
//			 							{
//			 								"In this carnival of the tech-enthusiasts, the geeks, the technocrats and so many more, we present to you the Debate competition. \n Contemplate. Cogitate. Contest.",
//			 								"Present your debating  skills",
//			 								"•It will be an oxford style debate conducted in two rounds.\n•Eight teams will qualify for the finals to be held on the second day.\n•Structure of the Event: Each speaker gets a floor time of three minutes. There will be two interjections, following the speech of every speaker, either from the judges or the audience.\n•The topic for the first round is “India or west, the land of opportunities�?\n•The topic for the Final round will be announced on the day of the first round itself.\n•",
//			 								"1.Maximum time limit for  speaking -3 min \n2.No use of abusive words in the speaking content .\n3.Students shall be given time to pen down their ideas on paper sheets will be provided, and collected at the end of the event.",
//			 								"•Negative marks will be awarded for exceeding the time limit.\n•Extra marks will be awarded for the body language /confidence/speaking skills.\n•Extra points will be awarded for strong points /views /relevant statistical data involved in the content.\n•Plus points for completely sticking on topic  like the for/against  the motion.",
//			 								"Rs 50 PER HEAD",
//			 								"Soman- +918527787397 \n Siddharth: +918287683957"
//
//			 							}
//	 								  ,
//
//	 									  {
//	 										  "Do you really brag about your aided graphical skills or think you are an efficient and smart designer?\nThen it is time to prove yourself at a game of both skills and speed.",
//	 										  "1.You would be asked to design in two levels.\n2.The platform given would be AUTOCAD or AUTODESK INVENTOR, and it’s your choice to choose one.\n3.The level 1 comprises of a design or a task that has to be completed in a given time. Failing prompt will make you disqualified.\n4.The level 2 comprises of another given design task, the one who does it first shall be declared victor..\n5.Any cheating or misconduct would lead to disqualification.",
//	 										  "Rs. 80",
//	 										  "Abhay- +919990396887"
//	 									  },
//	 									  {
//	 										  "Ever wondered how some great short movies like ‘Land without bread’ or the recent ‘TVF Pichers’ were made by a bunch of inexperienced guys on the lukewarm days of holiday. So now is the time to shred the wonder-struck face,take a camera(maybe a 5MP one), and show the world what you want them to. Take a camera(or a phone), and trek across our campus.\n Capture videos, or photos and join them.\nAdd effects and then submit it to us and we’ll provide you the platform to flaunt what is yours.\n",
//	 										  "1)You need to make a picturesque presentation of your campus. It can be a campus tour video or a slideshow of snaps.Edit them the way you like, add music,add after effects.\n3)Take care of the maximum time limit of 5 minutes.\n3)No bar on use of editing software. Any, and all elements are allowed.\n4)Once prepared, send us the video through the official fb metacognition page i.e www.fb.com/metacognitionfest, with your Team’s name followed by the details of its members.\n5)Final decision will be taken by judges after watching the video.There will be NO JUDGEMENT based on the LIKES, or COMMENTS a video gets.\n6)Each team has to submit a fees of 50/­ to the contact given at the end.\n7)The last date for the submission of the video is 1st October,failing to which no entries shall be accepted.\n8)The team with the best video will get a cash prize along with exciting goodies in the days of the festival.\n",
//	 										   "Vibhav: 9899279446 \n Vikash: 8285872278\nKushagra: 8765550098"
//	 									  },
//	 									  {
//	 										  "Topic for the event: To be provided on the spot",
//	 										  "\n•The coordinators will provide you with a sheet of A4 sized paper.\n•You are requested to carry your own toolkit which may include pencils, erasers, sketch-pens, crayons and/or pencil colors. Any form of paint colors are prohibited in the event.\n•The purpose of the event is to draw, and create an original advertisement on the provided topic using the allowed methods.\n•The artwork shall be marked on the grounds of its originality, meaningfulness and humor or any other meaning attached to it.\n•The judge’s decision on the scorecard shall be the final assessment of the event.",
//	 										  "Rs 50",
//	 										  "Kumar Shubham: 8588820627 \nAnkitSrivastava: 9899098262\nKushagarSharan: 9540440479"
//
//	 									  },
//	 									  {
//	 										  "Design a logo of our technical fest METACOGNITION and mail the same to our email id: teamenthiran@gmail.com by the end of the festival along with your contact details.. The best among the entries shall be declared as winner.",
//	 										  "FREE OF COST",
//	 										  "SARANSH GUPTA- 8800844282 "
//	 									  }
//	 								  };
	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	

	public static Description_page newInstance() {
		return new Description_page();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.activity_item_one, container, false);


			mSectionsPagerAdapter = new SectionsPagerAdapter(
					getChildFragmentManager());

			mViewPager = (ViewPager) v.findViewById(R.id.pager);
			mViewPager.setAdapter(mSectionsPagerAdapter);
			String ser = getArguments().getString("User");
			posi = Integer.parseInt(ser);
			System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy  " + posi);
			// m1=(posi/10);
			//m2=posi%10;
			m1 = posi;
			m2 = 0;
			mSectionsPagerAdapter.notifyDataSetChanged();



		return v;
	}
	
	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public int getItemPosition(Object object) {
		    return POSITION_NONE;
		}
		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putString("POSS", position + "");
			args.putInt("m1", m1);
			args.putInt("count", events_title[m1].length);
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position +1);
						fragment.setArguments(args);
						fragment.setArguments(args);
						return fragment;
						
						
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return events_title[m1].length;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			/*switch (position) {
			case 0:
				return events_title[m1][m2][0].toUpperCase(l);
			case 1:
				return events_title[m1][m2][1].toUpperCase(l);
			
			}*/

			for(int i=0;i<events_title[m1].length;i++)
			{
				if(i==position)
				{
					return events_title[m1][i].toUpperCase(l);
				}
			}
			
			return null;
		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		ListView list;
		//ProgressDialog mProgressDialog;
		String[][] events_title=
				{
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Syllabus", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"},
						{"Introduction", "Rules", "Registration Fee ", "Coordinator"}
				};
		String[][] problemstatement=
                {
                        {
								"You get to create a superhero out of your imagination as well their strengths and their weakness as well. They could be a combo of ironman with the game tactics of Garfield, because well, the sky is the limit! We’re looking to be blown away by the literary acumen and the rampant imagination.",
								"1. This is an individual event.\n" +
										"\n" +
										"2. You have to create your own superhero.\n" +
										"\n" +
										"3. The superhero should have a definite story. His/her strengths, weaknesses, a background story that turned him into superhero, his/her nemesis and anything else you can think of. The superhero may or may not be an earthling. We are simply looking to be blown away by your imagination.\n" +
										"\n" +
										"4. You have to take utmost care of originality. The name, dress, appearance, attributes - everything associated with your superhero has to be altogether new and 'never-seen-before'. Yet it has to be believable.\n" +
										"\n" +
										"5. The storyline has to be simple, concise and most importantly convincing. The reader should be able to relate to it. The characters should tend to communicate with the reader keeping him engrossed.\n" +
										"\n" +
										"6. You need to submit your write-up at least one day prior to the day of the event for assessment, i.e., the deadline is 10th Feb 2016. You have to mail it to us at onyxgalgotiaslitfest@gmail.com in docx format.",
                                "₹50",
                                "Raaj"," +918252378008 "

                        },
                        {
                                "Bogged down by the language barrier? Think Hinglish to be your preferred mode of communication? We present to you bilingual debate. You can converse in Hindi and English both, provided one particular line is in one particular language only. Now, let's see some real debate, a mash up of logic and stats and some bang on judgements by our panel of experts! And other such events in which creativity and wittiness fight it out, with literary acumen as the backbone!",
                                "Rules\n" +
										"\n" +
										"1. The debate will be conducted on individual basis. No teams are allowed.\n" +
										"\n" +
										"2. There are two rounds in Abhivyakti.\n" +
										"\n" +
										"3. The speaker can speak either for the motion or against the motion.\n" +
										"\n" +
										"4. The total floor time for each speaker in Round 1 will be three minutes, followed by interjection by the judges.\n" +
										"\n" +
										"*Negative marks will be awarded to those who exceed the three minute time limit.\n" +
										"\n" +
										"5. The topic of Round 1 is Hindu terror: myth or fact\n" +
										"\n" +
										"6. Based on the selection criteria, to be announced later on, the speakers will be selected for Round 2.\n" +
										"\n" +
										"7. The details of Round 2 will be given only after the completion of Round 1.\n" +
										"\n" +
										"8. Make sure you can use English, Hindi or both as the medium of your expression. In this way, your grip on the topic will be analysed by keeping an eye on your literary acumen.",
                                "₹50",
                                "Talat"," +919899863581 "
                        },


            {
                "What would happen if the dimwitted womanizer Johny Bravo's Momma decides to adopt Courage,the timid dog with paranoia problems or Dee Dee gets lost in Wonderland?Its time to dig deeper in the stories of lost childhood.So,turn the toonworld upside down,fathom the depth of literature to tell the world a story that has never been imagined. ",
                        "General\n" +
								"\n" +
								"1. This is an individual event.\n" +
								"\n" +
								"2. No language barrier (English/Hindi, no Hinglish)\n" +
								"\n" +
								"Round 1\n" +
								"\n" +
								"1. Individuals have to bring their own story by connecting any random cartoons (aired in India during 1990s and early 2000s).\n" +
								"\n" +
								"2. No restriction on cartoons until it is vulgar or obscene.\n" +
								"\n" +
								"3. Connection word limit 750 words.\n" +
								"\n" +
								"4. Judges decision will be final and binding.\n" +
								"\n" +
								"Round 2\n" +
								"\n" +
								"1. Best connections go to round 2.\n" +
								"\n" +
								"2. In this round, cartoon characters and situation will be assigned.\n" +
								"\n" +
								"3. The contestants have to narrate the connection in an interactive way.\n" +
								"\n" +
								"4. Marking will be done on basis of narration and connection.\n" +
								"\n" +
								"5. Time and word limit will be disclosed after round 1.\n" +
								"\n" +
								"6. Judges decision will be final and binding.",
                        "₹ 50 PER HEAD",
                        "Diksha"," +919650443654 "


            },
            {
                "Onyx!\n" +
						"\n" +
						"It might be just a comic name for you but for us it is \"mighty\" much like Thor's Hammer and yes only the worthy can behold the title of being Mr and Mrs Onyx!\n" +
						"\n" +
						"And to judge it we present to you LITERATHON. This singularly quirky event consists of 3 mind bobbling rounds \"Buzz'em-pore\" , \" Find my I.D.\" And \"Spellathon\" where we choose a winner who's an all rounder literary fanatic and shows their prowness in all the fields.\n" +
						"\n" +
						"What are those events?\n" +
						"\n" +
						"Good question, very astute!\n" +
						"\n" +
						"Buzz'em-pore is a preliminary round in which every team will be given a topic to speak upon for 3 minutes. Well isnt it extempore then? No, that's where the twist comes at every buzzer the speaker will be switched and they have to pick up from where the later left. Mind you the thoughts or the ideas cannot be repeated cause for every repetition there is negative marking. The one who qualify will move in to the next hurdle!\n" +
						"\n" +
						"Find my I.D.\n" +
						"\n" +
						"It is round much similar to the game Dumb Charades, where every team will be provided with 3 well known characters' names. Now, one has to either act or use the provided props for the other to determine the identity of the character. Mind you! One can only use acting or props not more than twice! And no dictionary! The one's who could struggle the heat of the two rounds would qualify to our last segment \"Spellathon\". It is easy yet the most difficult round of literathon!\n" +
						"\n" +
						"Every team has to spell out certain words. And yes the words will be very easy, Pun intended!\n" +
						"\n" +
						"And the winners would be our very own Mr and Ms Onyx!",
                        "A team of two is necessary with one guy and one girl!\n" +
								"\n" +
								"The team will remain fix and no later changes will be entertained.\n" +
								"\n" +
								"Both team mates have to participate in all three rounds in order to win the title.",
                        "₹ 100 per head",
                        "Soman"," +918527787397"

            },

            {
                "Moment to chase dragon balls once again!! Like Son Goku , play your own \"kamehameha\" and showcase your \"super saiyan\" swagg. Along with your squad , battles a wide variety of clues to seeks seven dragonballs altogether. So, throw up your \"spirit bomb\" to win the quest in the end.\n"
						,
                        "1- Dragon ball z hunt is a team event . Each team may have a maximum of four members in it.\n" +
								"\n" +
								"2- Each team has to announce their leader at the time of registration.\n" +
								"\n" +
								"3-Further, Dragon ball z hunt is divided into three rounds.\n" +
								"\n" +
								"ROUND 1:\n" +
								"\n" +
								"It is a reasoning type competition and the top twelve will make through to the next round.\n" +
								"\n" +
								"ROUND 2:\n" +
								"\n" +
								"a) Each team will be provided with team color and an envelope consisting of certain clues .\n" +
								"\n" +
								"b) Clues will be different for different sets of team.\n" +
								"\n" +
								"c) The clues will lead the teams to their respective location where they will find a dragon ball in another envelope . Each envelope leads the team to the next one and so on.\n" +
								"\n" +
								"d) There is a time limit of one hour for the competing teams to find 4 dragon balls .\n" +
								"\n" +
								"e) The first four winning team qualify for the next round happening on the next day of onyx.\n" +
								"\n" +
								"ROUND 3:\n" +
								"\n" +
								"a) Rules for Round 3 are same as Round 2 but the difficulty level will increase.\n" +
								"\n" +
								"b) Each team will be allotted one clue at the beginning that lead them to the next clue with a dragon ball.\n" +
								"\n" +
								"c) Each clue leads to the next clue and a dragon ball and so on.\n" +
								"\n" +
								"d) In this round , the winning team shall be the first one to collect 3 dragon balls.\n" +
								"\n" +
								"e) All the clues of teams are at different places but the last or 3rd dragon ball at the same place . The team which finds the 3rd dragon ball first , wins.\n" +
								"\n" +
								"In case of disputes or conflicts, the decisions of the coordinators shall be considered final.",
                       		 "₹200 (For Team of 4)",
                        		"Rajat"," +917838023917"
            },
						{
								"So this is it! The time has come to announce our first main event of our beloved onyx - \"From page to stage\" happening on 13th Feb, 2k16. This is our dramatics event and mind you! It's not just any ordinary drama competition! ;)\n" +
										"It will establish your mettle as a great actor and a great team beautifully melted in the theme of \"COMEDY\". :)",
								"1. This is a team event and there is no restriction on the number of members in each team. Sadly, no solo performances will be entertained. \n" +
										"\n" +
										"2. The play can be in Hindi , English or bilingual .\n" +
										"\n" +
										"3. Two teams from the same college can participate in the event. Each team should carry their props along with them. \n" +
										"\n" +
										"4. Each skit should be within 10 minutes. \n" +
										"\n" +
										"5. Inappropriate content , vulgarity and blasphemy will lead to immediate disqualification . \n" +
										"\n" +
										"6. The decision taken by our eminent judges will be final and binding.\n",
								"₹500 Per Team",
								"Aishwarya"," +919643395110 "
						},

						{
                "The world is a small happy place. Here Mickey greets Ariel with an 'i' and Ariel meets Leo with 'l'. Batman catches Donald with his 'a' and Popeye plays with Pluto's 'p'. Still confused? Welcome to Cartoon Crossword. Crisscross lines, counting blocks, filling spaces, adjusting names and bingo! All your cartoons are ready to cross your paths! \n",

                        "1. Do not duplicate words in the grid.\n" +
								"\n" +
								"2. Diagonal words are not allowed.\n" +
								"\n" +
								"3. There will be three levels\n" +
								"\n" +
								"a. The Pledge (Easy)\n" +
								"\n" +
								"b. The Turn (Medium)\n" +
								"\n" +
								"c. The Prestige (Difficult)\n" +
								"\n" +
								"4. Time constraints will be there in each level\n" +
								"\n" +
								"a. 5 minutes\n" +
								"\n" +
								"b. 10 minutes\n" +
								"\n" +
								"c. 15 minutes\n" +
								"\n" +
								"5. The decision of organising team will be final, in case of any dispute.\n" +
								"\n" +
								"6. The winner will be decided on the basis of maximum correct answers within the time limit.\n" +
								"\n" +
								"7. In case of a tie in the number of correct answers the person with minimum time of completion will qualify for the next round or will be awarded the winner.",
					"₹ 50 PER HEAD"," Amritansh ","+919650659386"
            },
            {
                "Do you think you've the knack of finishing open-ended stories, unfinished letters? If yes, then you might be the biggest contender for bagging the winner's trophy! We present to you \"Naughty Notes\". Show us how ingenious you are by giving an incomplete story a fabulous end. 30 minutes - you write a script. Then Bam! we shuffle it and you get a brand - new script; and if you manage to complete the re-alloted scripts, well, well, well! hello winner!\n" ,
				        "1. This is an individual event.\n" +
								"\n" +
								"2. Participants will have to write a script on a topic given on spot.\n" +
								"\n" +
								"3. Time of writing is divided into two slots (30 min + 30min).\n" +
								"\n" +
								"4. After completion of the first slot the scripts will be shuffled and redistributed among the participants.\n" +
								"\n" +
								"5. In the second slot participants will have to complete the re-alloted scripts.\n" +
								"\n" +
								"6. Judging criteria will be based on the original script (first 30 minute slot), the modified story (second 30 minute slot) and how the overall story comes out.",
                        "₹ 50 PER HEAD",
                        "Ayush","+919761188177"

            },
            {
                "Miss the old cartoon network shows that made up most of your early years. Get ready to relive your childhood by quizzing out with cartoon facts not known to many. If you think you're intelligent than 'Dexter' or smarter than 'Phineas and Ferb' then here is a quiz based on the cartoon shows aired in India during the 90s and early 2000s. \n",
				        "1. This is a team event.\n" +
								"\n" +
								"2. Each team can consist of maximum two members.\n" +
								"\n" +
								"3. Quiz will be conducted in two stages.\n" +
								"\n" +
								"4. First stage will consist of preliminary round.\n" +
								"\n" +
								"5. Six teams will qualify for the next stage.\n" +
								"\n" +
								"6. Second stage will have 2/3 rounds depending on availability of time.\n" +
								"\n" +
								"7. Rules for every round will be explained by the quiz masters at that time.",

					"People can expect the quiz to be broadly from the following topics although it's not necessary that \n" +
							"\n" +
							"every topic will be covered. Plus there may be a few out of syllabus questions too ;)\n" +
							"\n" +
							"Unit 1: Cartoon Network\n" +
							"\n" +
							"1. The Addams Family\n" +
							"\n" +
							"2. Captain Planet and Planeteers\n" +
							"\n" +
							"3. Courage the Cowardly Dog\n" +
							"\n" +
							"4. Dexter's Laboratory\n" +
							"\n" +
							"5. Ed, Edd and Eddy\n" +
							"\n" +
							"6. The Flintstones\n" +
							"\n" +
							"7. The Jetsons\n" +
							"\n" +
							"8. Johny Bravo\n" +
							"\n" +
							"9. Popeye the Sailor\n" +
							"\n" +
							"10. Powerpuff Girls\n" +
							"\n" +
							"11. Richie Rich\n" +
							"\n" +
							"12. Samurai Jack\n" +
							"\n" +
							"13. Scooby Doo, Where Are You?\n" +
							"\n" +
							"14. Swat Kats: The Radical Squadron\n" +
							"\n" +
							"15. Tom and Jerry\n" +
							"\n" +
							"16. Tom and Jerry Kids\n" +
							"\n" +
							"Unit 2: Anime\n" +
							"\n" +
							"1. Beyblade\n" +
							"\n" +
							"2. Beyblade V-Force\n" +
							"\n" +
							"3. Beyblade G-Revolutions\n" +
							"\n" +
							"4. Digimon: Original Series\n" +
							"\n" +
							"5. Dragon Ball\n" +
							"\n" +
							"6. Dragon Ball Z\n" +
							"\n" +
							"7. Pokemon: Original Series\n" +
							"\n" +
							"8. Yu-Gi-Oh\n" +
							"\n" +
							"Unit 3: Disney\n" +
							"\n" +
							"1. Aladdin\n" +
							"\n" +
							"2. Buzz Lightyear of Star Command\n" +
							"\n" +
							"3. Chip n Dale Rescue Rangers\n" +
							"\n" +
							"4. Ducktales\n" +
							"\n" +
							"5. The Little Mermaid\n" +
							"\n" +
							"6. The Lion King's Timon and Pumba\n" +
							"\n" +
							"7. The New Adventures of Winnie the Pooh\n" +
							"\n" +
							"8. Quack Pack\n" +
							"\n" +
							"9. Talespin\n" +
							"\n" +
							" Unit 4: Loony Tunes\n" +
							"\n" +
							"1. The Bugs Bunny Show\n" +
							"\n" +
							"2. The Road Runner Show\n" +
							"\n" +
							"3. Sylvester and Tweety Mysteries",
					"₹ 50 PER HEAD",
					"Soman","+918527787397"
            },
						{
								"The event will be a moderated crisis simulation with a cross table meet between S.H.I.E.L.D. (Marvel) and A.R.G.U.S. (DC Comics equivalent of S.H.I.E.L.D.) , with both agencies having it under their mandate to call upon superheroes (no anti-heroes or villains) in their primary universes (not multiverse).\n" +
										"\n" +
										"\n" +
										"Participants may choose between representing either of the two agencies depending upon their preferred comic publisher. There will be no set agenda for the committee. Updates will be provided in the committee in real time which will direct the flow of the debate.",
								"The Marvel vs DC event will follow these guidelines:\n" +
										"\n" +
										"1. Unlike a Model United Nations Simulation, there will be no motions/sub agendas to be proposed or voted upon.\n\n" +
										"2. A member may speak only when recognised by the moderator.\n\n" +
										"3. No member may speak for more than 60 seconds, unless permitted by the moderator\n\n" +
										"4. Members of both the agencies have the power to issue directives to superheroes  of their respective universes (any) to perform certain tasks in order to proactively tackle issues but the directive’s success will be decided upon by the moderators. For Instance, a member of S.H.I.E.L.D. may issue a directive asking The Hulk to destroy Wayne Manor. It is up to the moderator’s discretion whether the Hulk succeeds in doing so or not.\n\n" +
										"5. No member may issue another directive until the moderators rule upon a previously sent directive.",
								"₹ 50 PER HEAD",
								"Ashutosh","+918130363979"
						},
						{
								"In the words of Eliot,\"Poetry is not a turning loose of emotion, but an escape from emotion; it is not the expression of personality, but an escape from personality. But, of course, only those who have personality and emotions know that what it means to want to escape from these things.\" So this ONYX, let go of reality and escape to a surreal world.\n" ,
								"1. First round is open to all.\n" +
										"\n" +
										"2. Only individual participation is allowed.\n" +
										"\n" +
										"3. The event is UNILINGUAL: participants may submit their pieces in English or Hindi only, no Hinglish allowed.\n" +
										"\n" +
										"4. The poems have to be self composed and unpublished.\n" +
										"\n" +
										"5. The theme for the event is \"SATIRE\".\n" +
										"\n" +
										"6. Time limit for poem is 4 minutes.\n" +
										"\n" +
										"7. Participants may submit ONE entry only.Submission of multiple entries shall lead to disqualification.\n" +
										"\n" +
										"8. Plagiarism will not be tolerated and shall lead to disqualification.\n" +
										"\n" +
										"9. Judge's decision is final and binding.\n" +
										"\n" +
										"Round 2\n" +
										"\n" +
										"Haiku is a very short form of Japanese poetry. Don’t worry you need not speak Japanese or be a poet for that matter. Haiku as stated above is very short, exactly 17on (Japanese vowels).In this modern rendition we allow you 17 words including the authors name. (16 words effective) The topic for the poem will be allotted to you on the spot and you’ll have to compose your Haiku in the allotted time.\n" +
										"\n" +
										"Rules\n" +
										"\n" +
										"Points to be awarded on basis of\n" +
										"\n" +
										"1. Trueness to the allotted topic\n" +
										"\n" +
										"2. Vocabulary\n" +
										"\n" +
										"3. Ideas discussed\n" +
										"\n" +
										"4. Any Haiku exceeding 17 words will be disqualified.\n" +
										"\n" +
										"5. English/Hindi is the medium. No Hinglish allowed.\n" +
										"\n" +
										"If you are a student of Japanese, we will consider your haiku if it is comprised of 17 on and is written in romaji.",
								"₹ 50 PER HEAD",
								"Rajat,Akshat",
								"+918802807358,+919810555053"
						},
						{
								"Who says cartoons are only for entertainment?? Remember toons have some geniuses of their own and one of the most brilliant of all was Dexter. So, here Dexter invites you to his lab. Have anything you can do better than others? Showcase it here with us at the Dexter's corner.\n" ,
								"1. Paper presentation is an individual competition. It will consist of one round in which all competitors will present their presentation.\n" +
										"\n" +
										"2. Firstly, the competitor will present their presentation without interruption for 15minutes. A competitor must stop speaking when asked to do by the judges.\n" +
										"\n" +
										"3. Secondly, the judging panel will question the competitor on their oral presentation.\n" +
										"\n" +
										"4. Presentation must contain more than 10 slides , otherwise candidate will disqualify.\n" +
										"\n" +
										"5. All competitors will be judged by the same judging panel for the oral component.\n" +
										"\n" +
										"6. In the event of tie , the competitor will be ranked by the following criterion :-\n" +
										"\n" +
										"~The score will be broken down into the oral and written component of the score. The competitor with the highest score for the oral component will be deemed to be ranked higher.",
								"₹ 50 PER HEAD",
								"Diksha",
								"+918287683957"
						}
        };


        public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}
		
		View rootView;
		int divs,m1,m2,count;
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			
			divs=Integer.parseInt(getArguments().getString("POSS"));
			m1=getArguments().getInt("m1");
			m2=getArguments().getInt("m2");
			count=getArguments().getInt("count");
			
		   //	divs=Integer.parseInt(getArguments().getString("POSS"));
		   	rootView = inflater.inflate(R.layout.list_view_layout,
					container, false);
		list=(ListView)rootView.findViewById(R.id.listview_day2);
		//	TextView dummyTextView = (TextView) rootView
			//		.findViewById(R.id.section_label);
			//dummyTextView.setText(username);
		  //new MyTask().execute();
	 // mProgressDialog.dismiss();
	 //String mon_nme[];
		//String mon_nme1[];
		//String mon_nme2[];
	 	String mon_nme[];
		String mon_nme1[]=funcsep(problemstatement[m1][divs]);
		String mon_nme2[]=funcsep(problemstatement[m1][divs+1]);

	 /*if(divs==0)
	 {
		  	/*rootView = inflater.inflate(R.layout.imagelayout5_1,
					container, false);
		  	ImageView imageview1=(ImageView)rootView.findViewById(R.id.imageView1);
		  	 imageview1.setImageResource(R.drawable.meta22);
		  	 TextView tcv=(TextView)rootView.findViewById(R.id.textView1);
		  	 tcv.setText(problemstatement[m1][m2][0]);
		  	*////
		 String s1[]={""+problemstatement[m1][0]};
		 Integer si2[]={R.drawable.img1};
		imagecustom5 ic5=new imagecustom5(getActivity(), s1,si2);
			list.setAdapter(ic5);
			//
			
		 
//	 }*/
	 if(divs==count-1)
	 {
		 imagecustom7 ic7=new imagecustom7(getActivity(), mon_nme1, mon_nme2);
	    	list.setBackgroundColor(Color.BLACK);
			list.setAdapter(ic7);
			

	 }
	 else{
		 rootView = inflater.inflate(R.layout.imagelayout6,
					container, false);
		  	 //ImageView imageview1=(ImageView)rootView.findViewById(R.id.listImage);
		  	 //imageview1.setImageResource(R.drawable.meta22);
		  	 TextView tcv=(TextView)rootView.findViewById(R.id.textView1);
		  	 tcv.setText(problemstatement[m1][divs]);
		  	
		 }
			return rootView;
		///	SQLiteData	`1
		// `	`base db=openOrCreateDatabase("MYDataBase", 0, null);
			
		}
		public String[] funcsep(String spr)
		{	String[] temp;
		String delimiter = ",";
		  /* given string will be split by the argument delimiter provided. */
		  temp = spr.split(delimiter);
			return temp;
			
		}
		}
	
}
