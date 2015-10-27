package org.swtk.commons.dict.wordnet.index.name.instance.k.a.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKATH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"katharevusa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06989619\"]}");
	add("{\"term\":\"katharobe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13145288\"]}");
	add("{\"term\":\"katharometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03614360\"]}");
	add("{\"term\":\"katharsis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00254262\", \"00254444\"]}");
	add("{\"term\":\"kathmandu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08926582\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }