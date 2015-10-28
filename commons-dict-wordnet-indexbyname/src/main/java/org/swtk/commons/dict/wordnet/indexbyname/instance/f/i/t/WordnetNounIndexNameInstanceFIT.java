package org.swtk.commons.dict.wordnet.indexbyname.instance.f.i.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFIT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fit\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00556362\", \"04937484\", \"14106270\", \"14429707\"]}");
	add("{\"term\":\"fitch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02445745\"]}");
	add("{\"term\":\"fitfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04777774\"]}");
	add("{\"term\":\"fitment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03358127\"]}");
	add("{\"term\":\"fitness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05161042\", \"14570034\", \"04724140\"]}");
	add("{\"term\":\"fitter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10113677\"]}");
	add("{\"term\":\"fitting\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00796669\", \"02733566\", \"03358462\", \"07384204\"]}");
	add("{\"term\":\"fittingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04724140\"]}");
	add("{\"term\":\"fitzgerald\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10991973\", \"10992086\", \"10992290\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }