package org.swtk.commons.dict.wordnet.index.name.instance.s.m.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSMAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"smack\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00134488\", \"00139419\", \"02840630\", \"04251975\", \"05723811\", \"07425345\"]}");
	add("{\"term\":\"smacker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00134695\", \"00139554\"]}");
	add("{\"term\":\"smacking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00134488\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }