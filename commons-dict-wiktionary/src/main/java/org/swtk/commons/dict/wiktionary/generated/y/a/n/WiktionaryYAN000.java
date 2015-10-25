package org.swtk.commons.dict.wiktionary.generated.y.a.n;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYAN000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yana", "{\"term\":\"yana\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"From Sanskrit \u0027यान|sc\u003ddeva|tr\u003dyana|lang\u003dsa\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of the vehicles of Buddhist or Tantric practice\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2013\u0027\u0027, Chögyam Trungpa, edited by ‎Judith L. Lief, \u0027The Bodhisattva Path of Wisdom and Compassion\u0027, volume 2, chapter\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The Tibetan word for \u0027\u0027yana\u0027\u0027 is \u0027thekpa\u0027, which means \u0026quot;that which lifts you up.\u0026quot; Anything that lifts you up and takes you to your destination is a \u0027\u0027yana\", \"priority\":3}]}, \"synonyms\":{}}");

	add("yank", "{\"term\":\"yank\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"scots\"], \"text\":\"Attested since 1822 {{C.E.}}; from Scots {{unk.|en}} origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A sudden, vigorous pull (sometimes defined as mass times jerk, or rate of change of force\", \"priority\":1}]}, \"synonyms\":{}}");

	add("yangon", "{\"term\":\"yangon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|my|ရန်ကုန်|tr\u003dran-kun|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The largest city and former capital of Myanmar (Burma). Formerly known as Rangoon. The administrative capital has been moved to Naypyidaw or Nay Pyi Taw\", \"priority\":1}]}, \"synonyms\":{}}");

	add("yankee", "{\"term\":\"yankee\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Dutch\"], \"text\":\"First attested in 1683, as a name applied disparagingly by Dutch settlers in Nieuw Amsterdam (New York) to English colonists in neighboring Connecticut. It may be from Dutch \u0027janke\u0027 (little john) the old diminutive form of the common personal name \u0027jan\u0027 or it may be from \u0027jan kees\u0027 the familiar form of \u0026quot;Johan Cornelius\u0026quot;, or a variant of \u0027jan kaas\u0027 literally \u0026quot;John Cheese\u0026quot;, the generic nickname the Flemings used for Dutchmen. It originally seems to have been applied insultingly to Dutch, especially freebooters, before they turned around and applied it to the English. In English it was a term of contempt (1750s) before it came to be used as a general term for \u0026quot;a native of New England\u0026quot; (1765). The shortened form Yan. Proper noun|Yank was first recorded in reference to \u0026quot;an American\u0026quot; in 1778.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A native or inhabitant of New England\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A native or inhabitant of the Northern USA\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A native or inhabitant of the USA\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A large triangular headsail used in light or moderate winds and set on the fore topmast stay. Unlike a genoa it does not fill the whole fore triangle, but is set in combination with the working staysail\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A player that plays for the w:New York New York Yankees\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A wager on four selections, consisting of 11 separate bets: six doubles, four trebles and a fourfold accumulator. A minimum two selections must win to gain a return\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"1980\u0027\u0027, \u0027New Scientist\u0027 (volume 85, number 1199, 20 March 1980\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Betting is complicated with win bets, place bets, each-way bets and complex bets such as doubles, trebles, \u0027\u0027Yankees\u0027\u0027 and the like\", \"priority\":8}]}, \"synonyms\":{}}");

	add("yanker", "{\"term\":\"yanker\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|yank|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who yanks, or gives a sudden hard pul\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A brazen li\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }