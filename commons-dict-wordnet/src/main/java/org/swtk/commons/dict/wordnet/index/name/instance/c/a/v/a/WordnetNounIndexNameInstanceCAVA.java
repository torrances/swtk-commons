package org.swtk.commons.dict.wordnet.index.name.instance.c.a.v.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAVA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cavalcade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08444875\"]}");
	add("{\"term\":\"cavalier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09921581\", \"09921709\"]}");
	add("{\"term\":\"cavalla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02628481\"]}");
	add("{\"term\":\"cavalry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08406441\", \"08414813\"]}");
	add("{\"term\":\"cavalryman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09921806\", \"09922064\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }