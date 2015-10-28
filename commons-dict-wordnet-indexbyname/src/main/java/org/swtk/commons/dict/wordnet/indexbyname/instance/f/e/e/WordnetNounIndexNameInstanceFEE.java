package org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13309552\", \"13341190\"]}");
	add("{\"term\":\"feeblemindedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05654568\"]}");
	add("{\"term\":\"feebleness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05048093\", \"14571235\"]}");
	add("{\"term\":\"feed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07816067\"]}");
	add("{\"term\":\"feedback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06759184\", \"13500583\"]}");
	add("{\"term\":\"feedbag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03836743\"]}");
	add("{\"term\":\"feeder\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"01320407\", \"02846791\", \"04176768\", \"09301903\", \"10062108\", \"01320304\"]}");
	add("{\"term\":\"feeding\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01059683\", \"00840028\"]}");
	add("{\"term\":\"feedlot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03331316\"]}");
	add("{\"term\":\"feedstock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14621019\"]}");
	add("{\"term\":\"feel\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00856168\", \"04953730\", \"14549784\", \"05685184\"]}");
	add("{\"term\":\"feeler\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02587916\", \"04850501\", \"07179000\", \"02587546\"]}");
	add("{\"term\":\"feeling\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05715665\", \"05730374\", \"05729447\", \"14549784\", \"05925333\", \"00026390\"]}");
	add("{\"term\":\"feelings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07528274\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }