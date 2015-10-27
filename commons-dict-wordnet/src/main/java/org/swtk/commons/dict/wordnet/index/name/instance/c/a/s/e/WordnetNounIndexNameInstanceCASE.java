package org.swtk.commons.dict.wordnet.index.name.instance.c.a.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCASE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"case\", \"synsetCount\":20, \"upperType\":\"NOUN\", \"ids\":[\"02978671\", \"02978871\", \"02979048\", \"02981078\", \"04197790\", \"05245366\", \"06838449\", \"09928518\", \"14039467\", \"06321935\", \"13788576\", \"06662171\", \"06797823\", \"10688105\", \"09918344\", \"02978156\", \"05825869\", \"01185144\", \"13966452\", \"07323507\"]}");
	add("{\"term\":\"casebook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06515025\"]}");
	add("{\"term\":\"caseful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13788576\"]}");
	add("{\"term\":\"casein\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02979453\", \"14759526\"]}");
	add("{\"term\":\"casement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02979809\"]}");
	add("{\"term\":\"casern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02980011\"]}");
	add("{\"term\":\"casework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01211569\"]}");
	add("{\"term\":\"caseworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10639543\"]}");
	add("{\"term\":\"caseworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02272174\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }