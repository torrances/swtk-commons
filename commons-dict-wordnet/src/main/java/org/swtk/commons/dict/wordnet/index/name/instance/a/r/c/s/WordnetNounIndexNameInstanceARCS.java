package org.swtk.commons.dict.wordnet.index.name.instance.a.r.c.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARCS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"arcsec\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13811032\"]}");
	add("{\"term\":\"arcsecant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13811032\"]}");
	add("{\"term\":\"arcsecond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13632638\"]}");
	add("{\"term\":\"arcsin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13809763\"]}");
	add("{\"term\":\"arcsine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13809763\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }