package org.swtk.commons.dict.wiktionary.generated.b.i.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBIE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bieberite", "{\"term\":\"bieberite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Bieber|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fan of Canadian singer\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Jen Skerritt, \u0026quot;[http://www.winnipegfreepress.com/local/omg-102937364.html?story\u003dOMG! OMG!]\u0026quot;, \u0027Winnipeg Free Press\u0027, 15 September 2010\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Few male fans were on hand Tuesday night, which according to \u0027\u0027Bieberites\u0027\u0027 is purely due to envy\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Justin Souther, \u0026quot;[http://issuu.com/mountainx/docs/mountain_xpress_02_16_2011 Justin Bieber: Never Say Never]\u0026quot;, \u0027Mountain Express\u0027, Volume 17, Issue 30, 16 February 2011 - 22 February 2011, page 56\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"It\u0027s a movie created solely for the legions of teen and younger \u0027\u0027Bieberites\u0027\u0027 (or whatever they call themselves), and a chance for them to see their icon in all the glory of three-dimensions\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Ben Hartman, \u0026quot;[http://www.jpost.com/Arts-and-Culture/Entertainment/Bieber-loyalists-keep-vigil-outside-the-pop-stars-TA-hotel Bieber loyalists keep vigil outside the pop star’s TA hotel]\u0026quot;, \u0027Jerusalem Post\u0027, 12 April 2011\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The two momentary stars were then mobbed by the \u0027\u0027Bieberites\u0027\u0027 looking to debrief them for any intel they could supply on the singer’s movements inside the hotel, and possible points of entry to the safe zone\", \"priority\":7}]}, \"synonyms\":{}}");

	add("biebermania", "{\"term\":\"biebermania\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Bieber|mania|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Enthusiasm for the Canadian singer\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Ree Hines, \u0027Tabloid Tidbits\u0027[http://today.msnbc.msn.com/id/37696649/ns/today-entertainment\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The last time she cozied up for a photograph alongside teen-dream Justin Bieber, Kim Kardashian learned just how serious \u0027\u0027Biebermania\u0027\u0027 could get when she received a rash of death threats\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Sarah Parvis, \u0027Justin Bieber\u0027 (page 65\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Biebermania\u0027\u0027 doesn\u0027t always result in injury, though. The outpouring of devotion from his fans comes in other ways, too\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }