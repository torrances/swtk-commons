package org.swtk.commons.dict.wiktionary.generated.l.y.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLYR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lyra", "{\"term\":\"lyra\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"From Latin \u0027\u0027lyra\u0027\u0027, from Ancient greek (to 1453) \u0027\u0027λύρα\u0027\u0027 (\u0027lyra\u0027) a \u0026quot;lyre, the constellation \u0027\u0027Lyra\u0027\u0027\u0026quot;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A summer constellation of the northern sky, said to resemble a lyre. It includes the bright star Vega and the Ring Nebula\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, Philip Pullman, \u0027Lyra\u0027s Oxford\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A little parapet ran all the way around the square roof, and Pantalaimon often draped his pine-marten form over the mock-battlements on the corner facing south, and dozed while \u0027\u0027Lyra\u0027\u0027 sat below with her back against the sun-drenched stone, studying the books she\u0027d brought up with her\", \"priority\":3}]}, \"synonyms\":{}}");

	add("lyrebird", "{\"term\":\"lyrebird\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|lyre|bird|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Either of two large ground-dwelling Australian songbirds, of the genus \u0027Menura\u0027, named because of the beautiful tail feathers of one species, the superb lyrebird () which can be erected to look like a lyre, most notable for their extraordinary ability to mimic natural and artificial sounds from their environment\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lyretail", "{\"term\":\"lyretail\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|lyre|tail|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of various fishes whose tails resemble a lyre (musical instrument\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }