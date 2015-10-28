package org.swtk.commons.dict.wordnet.indexbyname.instance.a.b.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abnaki\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06920824\", \"09665709\"]}");
	add("{\"term\":\"abnegation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00206498\", \"07219325\"]}");
	add("{\"term\":\"abnegator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09773964\"]}");
	add("{\"term\":\"abnormalcy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14525310\"]}");
	add("{\"term\":\"abnormality\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00738486\", \"04805434\", \"05654380\", \"14525310\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }