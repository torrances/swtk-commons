package org.swtk.commons.dict.wordnet.index.name.instance.m.o.s.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOSA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mosaic\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03793437\", \"03793580\", \"05940766\", \"06583966\", \"14304277\", \"03793292\"]}");
	add("{\"term\":\"mosaicism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14594609\"]}");
	add("{\"term\":\"mosan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06926544\"]}");
	add("{\"term\":\"mosander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11213240\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }