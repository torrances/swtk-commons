package org.swtk.commons.dict.wiktionary.generated.m.o.x;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMOX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("moxie", "{\"term\":\"moxie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the name of an American patent medicine first manufactured about 1885 and perhaps ultimately from an Abenaki word meaning \u0026quot;dark water\u0026quot;.\u0026lt;ref\u0026gt;\u0026quot;moxie (n.)\u0026quot;. Online Etymology Dictionary. 2014. Douglas Harper. 3 September 2014, http://www.etymonline.com/index.php?term\u003dmoxie.\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"backbone, determination and fortitud\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"initiative or skil\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"page\u003d401|pageurl\u003dhttp://books.google.com/books?id\u003dohnQr0ij3S8C\u0026amp;pg\u003dPA401\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003d1zfcUPbOEILrqAHV8YDIAQ\u0026amp;ved\u003d0CDwQ6AEwA\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"passage\u003dAs a girl she had speed and a knock-kneed \u0027\u0027moxie\u0027\u0027 at athletics, and might have done more with it if she hadn\u0027t harvested all the glory already\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"episode \u003d w:Rollercoaster (Phineas and Rollercoaster: The Musical! season \u003d 2 number \u003d 38 people \u003d role \u003d Building Engineer at \u003d “Aren\u0027t You a Little Young?” (song) passage \u003d Yes it\u0027s true! / That you seem a little young to do the things that you do, / even with all that \u0027\u0027moxie\u0027\u0027 you\u0027ve got\", \"priority\":5}]}, \"synonyms\":{}}");

	add("moxisylyte", "{\"term\":\"moxisylyte\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A drug used in urology for the treatment of erectile dysfunction\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }