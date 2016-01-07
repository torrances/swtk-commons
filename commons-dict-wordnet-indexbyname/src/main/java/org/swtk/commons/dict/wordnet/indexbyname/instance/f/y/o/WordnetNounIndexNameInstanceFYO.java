package org.swtk.commons.dict.wordnet.indexbyname.instance.f.y.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFYO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fyodor dostoevski\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960661\"]}");
	add("{\"term\":\"fyodor dostoevsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960661\"]}");
	add("{\"term\":\"fyodor dostoyevsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960661\"]}");
	add("{\"term\":\"fyodor mikhailovich dostoevski\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960661\"]}");
	add("{\"term\":\"fyodor mikhailovich dostoevsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960661\"]}");
	add("{\"term\":\"fyodor mikhailovich dostoyevsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10960661\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }