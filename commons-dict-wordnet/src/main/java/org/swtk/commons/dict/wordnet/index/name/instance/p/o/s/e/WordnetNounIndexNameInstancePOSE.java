package org.swtk.commons.dict.wordnet.index.name.instance.p.o.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOSE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pose\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00757016\", \"05088507\", \"04795239\"]}");
	add("{\"term\":\"poseidon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09592056\"]}");
	add("{\"term\":\"poser\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06798224\", \"10344226\", \"10475481\"]}");
	add("{\"term\":\"poseur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10475481\"]}");
	add("{\"term\":\"poseuse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10475636\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }