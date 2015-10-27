package org.swtk.commons.dict.wordnet.index.name.instance.t.u.r.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTURB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"turban\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03944111\", \"04505684\"]}");
	add("{\"term\":\"turbatrix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01934625\"]}");
	add("{\"term\":\"turbellaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01927774\"]}");
	add("{\"term\":\"turbidity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04711280\"]}");
	add("{\"term\":\"turbidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04711280\"]}");
	add("{\"term\":\"turbinal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05291315\"]}");
	add("{\"term\":\"turbinate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05291315\"]}");
	add("{\"term\":\"turbine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04505818\"]}");
	add("{\"term\":\"turbofan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03326048\", \"03326364\"]}");
	add("{\"term\":\"turbogenerator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04506168\"]}");
	add("{\"term\":\"turbojet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03326048\", \"03326364\"]}");
	add("{\"term\":\"turboprop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04018858\"]}");
	add("{\"term\":\"turbot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02665841\", \"07807015\"]}");
	add("{\"term\":\"turbulence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14002658\", \"14547985\", \"11541422\"]}");
	add("{\"term\":\"turbulency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11541422\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }