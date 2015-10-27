package org.swtk.commons.dict.wordnet.index.name.instance.c.o.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"comic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09959604\"]}");
	add("{\"term\":\"comicality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05217985\"]}");
	add("{\"term\":\"coming\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00062953\", \"05053622\", \"00049569\", \"00281697\"]}");
	add("{\"term\":\"comint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00985373\"]}");
	add("{\"term\":\"comity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13993301\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }