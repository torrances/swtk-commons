package org.swtk.commons.dict.wordnet.index.name.instance.v.a.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVANI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vanilla\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05724409\", \"07844783\", \"12107056\"]}");
	add("{\"term\":\"vanillin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12107549\"]}");
	add("{\"term\":\"vanir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09602518\"]}");
	add("{\"term\":\"vanisher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10766014\"]}");
	add("{\"term\":\"vanishing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00054626\", \"07350704\"]}");
	add("{\"term\":\"vanity\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03243289\", \"04894324\", \"05148287\", \"07524235\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }