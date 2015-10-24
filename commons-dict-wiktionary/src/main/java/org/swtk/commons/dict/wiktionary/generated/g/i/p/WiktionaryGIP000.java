package org.swtk.commons.dict.wiktionary.generated.g.i.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGIP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gippo", "{\"term\":\"gippo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"An alteration of \u0027gypsy\u0027 () which is in turn an alteration of \u0027egyptian\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Gypsy\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An Egyptian\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Gravy\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, George H. Coward, \u0027[http://books.google.co.uk/books?id\u003dbmVEQttbFusC\u0026amp;pg\u003dPA147\u0026amp;lpg\u003dPA147\u0026amp;dq\u003dgippo+gravy\u0026amp;source\u003dbl\u0026amp;ots\u003dm7vsZMjkWv\u0026amp;sig\u003dzWQRTCz2Zfjr-8Y5Ag1l6btisAc\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dQeT3Uv2TEI2Shgek8oH4BQ\u0026amp;ved\u003d0CFAQ6AEwA\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003dgippo%20gravy\u0026amp;f\u003dfalse Coward\u0027s War\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"He had his “dinner” in his canteen and placed it on the ground to go and “scrounge” a chunk of bread to help “fill up”, and as soon as he turned his back a dog walked in at the door of the barn, where we were “in residence” as they say “higher up”, [only we “flew no flag”], and started lapping up some of the “\u0027\u0027gippo\u0027\u0027”, [gravy] of which the said dinner was composed [in fact \u0027twas more “\u0027\u0027gippo\u0027\u0027” than dinner that day, so who could blame a dog for being mistaken\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Mildred Joan Tulip, \u0027[http://www.bbc.co.uk/history/ww2peopleswar/stories/35/a8999635.shtml My experiences as a VAD nurse\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"They were always asking for ‘more \u0027\u0027gippo\u0027\u0027’ (gravy) which we got for them if we could\", \"priority\":8}]}, \"synonyms\":{}}");

	add("gipper", "{\"term\":\"gipper\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|gip|er|t1\u003dclean [fish] for curing|pos2\u003dsuffix forming agent nouns|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who gips (\u0027i.e.\u0027, cleans fish in preparation for curing\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1641\u0027\u0027, Simon Smith, \u0027The Herring-Buſſe Trade\u0027, [https://archive.org/stream/herringbussetrad00smi\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"page/9/mode/2up page 9\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"One man takes the Herrings out of the VVell with the Ladner,\u0026lt;!-- or “Ladnet” — source illegible --\u0026gt; and fils the \u0027\u0027Gippers\u0027\u0027 baskets. // 9 \u0027\u0027Gippers\u0027\u0027 which cut their throats, and takes out the Guts, and fling the ful Herring into one Basket, and the ſhotten Herring into another\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }