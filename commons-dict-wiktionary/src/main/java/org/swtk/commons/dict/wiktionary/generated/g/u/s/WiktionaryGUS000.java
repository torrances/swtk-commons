package org.swtk.commons.dict.wiktionary.generated.g.u.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGUS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gush", "{\"term\":\"gush\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old norse\"], \"text\":\"{{etystub|en}}Middle english (1100-1500) possibly from Old norse \u0027geysa\u0027 (“to gush”);cognate with German \u0026quot;gießen\u0026quot; (\u0026quot;to pour\u0026quot;)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A sudden rapid outflow\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gusla", "{\"term\":\"gusla\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"See \u0027gusle\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1942\u0027\u0027, \u0027Black Lamb and Grey Falcon\u0027, Canongate 2006, p. 662-3\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Soldiers were sitting at tables among these flowers, some playing cards, some singing songs to the sound of the \u0027\u0027gusla\u0027\u0027, but very softly because it was now evening, and it had been a holiday, and everyone was tired\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, \u0027The Sleepwalkers\u0027, Penguin 2013, p. 22\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"These were long ballads, often sung to the melancholy accompaniment of the one-stringed \u0027\u0027gusla\u0027\u0027, in which singers and listeners relived the great archetypal moments of Serbian history\", \"priority\":4}]}, \"synonyms\":{}}");

	add("gusle", "{\"term\":\"gusle\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Serbo-Croatian\"], \"text\":\"From Serbo-croatian {{m|sh|gȕsle}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A single-stringed lute-like stringed instrument with a bowl-shaped body, held vertically in the lap and played a bow, originating among the Slavic peoples in the Balkans, especially in the Dinarides region\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gusto", "{\"term\":\"gusto\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Italian\", \"Latin\"], \"text\":\"From Italian \u0027gusto\u0027 from Latin \u0027gustus\u0027 (tasting)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"enthusiasm; enjoyment, vigo\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"He sang with more \u0027\u0027gusto\u0027\u0027 than talent\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1993\u0027\u0027, w:Paul Paul Chadwick, \u0027The Dictator’s Dream\u0027, Dark Horse Book\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"And the sound increases … the power grows … \u0027\u0027gusto\u0027\u0027 becomes something else: \u0027rage\", \"priority\":4}]}, \"synonyms\":{}}");

	add("gustation", "{\"term\":\"gustation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{PIE root|en|ǵews}}{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of tasting\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1841\u0027\u0027, Robley Dunglison, \u0027Human Physiology\u0027, page [http://books.google.com/books?id\u003ddDxx2F92BHkC\u0026amp;pg\u003dPA109\u0026amp;dq\u003dgustation 109\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The organ of \u0027\u0027gustation\u0027\u0027 is not, therefore, restricted to the production of that sense, but participates in the sense of touch\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The ability to taste flavors; the sense of taste\", \"priority\":4}]}, \"synonyms\":{}}");

	add("gustiness", "{\"term\":\"gustiness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being gusty; the presence of gusts of wind\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }