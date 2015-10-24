package org.swtk.commons.dict.wiktionary.generated.c.e.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCEP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("cephalalgia", "{\"term\":\"cephalalgia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|cephalo|alt1\u003dcephal|algia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A pain in the head; headache\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cephalin", "{\"term\":\"cephalin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a phospholipid found particularly in the cells of nervous tissue; it is also the primary phospholipid in bacteria\", \"priority\":1}]}, \"synonyms\":{}}");

	add("cephalosporin", "{\"term\":\"cephalosporin\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From {{taxlink|Cephalosporium|genus|noshow\u003d1}}, a genus of fungi.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of a class of natural and synthetic antibiotics developed from fungi, having a cepham structure\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027: Another important group of antibiotics, the \u0027\u0027cephalosporins\u0027\u0027, a class that includes more than twenty-five different drugs, are chemically distinct from the penicillins but act in the same way as cell wall inhibitors, as do vancomycin and bacitracin. — Leslie Iversen, \u0027Drugs: A Very Short Introduction\u0027 (Oxford 2001, p. 63\", \"priority\":2}]}, \"synonyms\":{}}");

	add("cepstrum", "{\"term\":\"cepstrum\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From a reversal of the first four letters of the word {{m|en|spectrum}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Fourier transform of the logarithm of a spectrum; used especially in voice analysis\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }