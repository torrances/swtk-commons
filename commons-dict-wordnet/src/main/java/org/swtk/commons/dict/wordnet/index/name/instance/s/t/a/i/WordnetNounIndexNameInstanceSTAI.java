package org.swtk.commons.dict.wordnet.index.name.instance.s.t.a.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTAI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"staidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04655183\"]}");
	add("{\"term\":\"stain\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00073081\", \"06807523\", \"14521680\", \"15077537\", \"04702524\"]}");
	add("{\"term\":\"stainability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04951887\"]}");
	add("{\"term\":\"stainer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10665471\"]}");
	add("{\"term\":\"staining\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00277657\", \"00276416\"]}");
	add("{\"term\":\"stainless\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14827091\"]}");
	add("{\"term\":\"stair\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04322052\"]}");
	add("{\"term\":\"staircase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04305446\"]}");
	add("{\"term\":\"stairhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04305082\"]}");
	add("{\"term\":\"stairs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04305309\"]}");
	add("{\"term\":\"stairway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04305446\"]}");
	add("{\"term\":\"stairwell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04305799\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }