package org.swtk.commons.dict.wiktionary.generated.f.e.e;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryFEE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("feeb", "{\"term\":\"feeb\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Short for \u0027feeble\u0027 in \u0027feeble-minded\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone who is feeble-minded; an idiot\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1931\u0027\u0027, William Faulkner, \u0027Sanctuary\u0027, Vintage 1993, p. 128\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"‘Everybody that knows anything about me knows that I wouldn\u0027t hurt a \u0027\u0027feeb\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Thomas Pynchon, \u0027Against the Day\u0027, Vintage 2007, p. 285\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"“Eeeyynnhh, too many \u0027\u0027feebs\u0027\u0027 to deal with over the years, I guess—oh \u0027I\u0027m\u0027 sorry, hope I\u0027m not offending—”\", \"priority\":5}]}, \"synonyms\":{}}");

	add("feedback", "{\"term\":\"feedback\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|feed|back|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Critical assessment on information produced\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"After you hand in your essays, I will give both grades and \u0027\u0027feedback\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The signal that is looped back to control a system within itself\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The high-pitched howling noise heard when there\u0027s a loop between a microphone and a speaker\", \"priority\":4}]}, \"synonyms\":{}}");

	add("feederism", "{\"term\":\"feederism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|feeder|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A paraphilia in which arousal is obtained from overfeeding\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Fedwa Malti-Douglas, \u0027Encyclopedia of Sex and Gender: A-C\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The growth of \u0027\u0027feederism\u0027\u0027 paralleled the development of feeder pornography, with the increase of Internet websites not unlike those devoted to the celebration of the skeletal beauty of anorexic bodies\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, Alyshia D. Bestard, \u0027Feederism: an exploratory study into the stigma of erotic weight gain\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Sometimes \u0027\u0027feederism\u0027\u0027 is practiced within relationships and sometimes it is practiced alone. Respondents emphasize the importance that fantasy plays within feederism\", \"priority\":5}]}, \"synonyms\":{}}");

	add("feedreader", "{\"term\":\"feedreader\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|feed|reader|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A software program that gathers content from newsfeeds\", \"priority\":1}]}, \"synonyms\":{}}");

	add("feeing", "{\"term\":\"feeing\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The hiring of servants for a fee\", \"priority\":1}]}, \"synonyms\":{}}");

	add("feels", "{\"term\":\"feels\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Feelings\", \"priority\":1}]}, \"synonyms\":{}}");

	add("feeler", "{\"term\":\"feeler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"to feel + -er\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Someone or something that feels\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Are you more of a \u0027\u0027feeler\u0027\u0027 or more of a thinker\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An antenna or appendage used for feeling, especially on an insect\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Something ventured to test another\u0027s feelings, opinion, or position\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"I sent out some \u0027\u0027feelers\u0027\u0027 but they didn\u0027t seem interested\", \"priority\":5}]}, \"synonyms\":{}}");

	add("féerie", "{\"term\":\"féerie\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"French \u0027féerie\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fantastical theatrical production featuring fairies\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027: Syd\u0027s \u0027\u0027féerie\u0027\u0027 entourage and girlies in drifting crinoline went out of the window, of course, along with his animated scarecrows — Jeremy Harding, ‘Afternoonishness’, \u0027London Review of Books\u0027 25:1Category:English terms spelled with É\", \"priority\":2}]}, \"synonyms\":{}}");

	add("feeze", "{\"term\":\"feeze\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"From Old english (ca. 450-1100) {{m|ang|fēsian||to drive away, put to flight}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"fretful excitemen\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a race; a run; a running start, as for a lea\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"vexation; worry; fret\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }