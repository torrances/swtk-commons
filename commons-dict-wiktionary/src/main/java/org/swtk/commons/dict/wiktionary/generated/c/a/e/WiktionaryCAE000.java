package org.swtk.commons.dict.wiktionary.generated.c.a.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCAE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("caecotrophy", "{\"term\":\"caecotrophy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"In certain mammals, especially rabbits and other lagomorphs, the consumption of food pellets which are naturally produced by means of digestion, retention in the caecum, and expulsion through the anus\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027, A. Belenguer \u0027et al.\u0027, \u0026quot;Alternative methodologies to estimate ingestion of caecotrophes in growing rabbits,\u0026quot; Livestock Science, vol. 115, no.1, p. 13\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The second group (T-2: 6 rabbits) was also fed the labelled diet but only during the last ten days of the fattening period when animals were fitted a neck collar to prevent \u0027\u0027caecotrophy\", \"priority\":3}]}, \"synonyms\":{}}");

	add("caecum", "{\"term\":\"caecum\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"Latin {{m|la|(ininum) caecum||blind gut}}, translation of Ancient greek (to 1453) {{m|grc|τυφλόν|τυφλὸν ἔντερον}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A blind pouch connected to the large intestine between the ileum and the colon\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1970\u0027\u0027: After a preliminary course in anatomy it was found that \u0027\u0027caecum\u0027\u0027 and transverse colon also provided excellent sites for excitation. — JG Ballard, \u0027The Atrocity Exhibition\", \"priority\":2}]}, \"synonyms\":{}}");

	add("caelatura", "{\"term\":\"caelatura\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The art of producing decorative metalwork other than statuary, such as reliefs, intaglios, engravings, and chasing\", \"priority\":1}]}, \"synonyms\":{}}");

	add("caerphilly", "{\"term\":\"caerphilly\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a town in Glamorgan, South Wales\", \"priority\":1}]}, \"synonyms\":{}}");

	add("caesarism", "{\"term\":\"caesarism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Caesar|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"autocrac\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"democratic dictatorship\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }