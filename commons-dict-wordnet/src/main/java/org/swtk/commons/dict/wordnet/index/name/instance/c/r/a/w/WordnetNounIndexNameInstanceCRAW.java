package org.swtk.commons.dict.wordnet.index.name.instance.c.r.a.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRAW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"craw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01976696\"]}");
	add("{\"term\":\"crawdad\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01987769\", \"07804861\"]}");
	add("{\"term\":\"crawdaddy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01987769\"]}");
	add("{\"term\":\"crawfish\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01987336\", \"01987769\", \"07804861\"]}");
	add("{\"term\":\"crawford\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10934300\", \"10934410\"]}");
	add("{\"term\":\"crawl\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00295712\", \"00571403\", \"00330861\"]}");
	add("{\"term\":\"crawler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01938036\", \"09995649\", \"10704310\"]}");
	add("{\"term\":\"crawling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00295712\"]}");
	add("{\"term\":\"crawlspace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08573247\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }