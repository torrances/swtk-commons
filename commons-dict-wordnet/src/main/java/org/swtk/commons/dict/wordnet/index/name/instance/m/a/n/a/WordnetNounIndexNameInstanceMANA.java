package org.swtk.commons.dict.wordnet.index.name.instance.m.a.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMANA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"manacle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03489659\"]}");
	add("{\"term\":\"manageability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04912723\"]}");
	add("{\"term\":\"manageableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04912723\"]}");
	add("{\"term\":\"management\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08397896\", \"01135602\"]}");
	add("{\"term\":\"manager\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09951098\", \"10034684\"]}");
	add("{\"term\":\"manageress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10309123\"]}");
	add("{\"term\":\"managership\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00595951\"]}");
	add("{\"term\":\"managua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08756880\"]}");
	add("{\"term\":\"manakin\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01554352\", \"03723460\", \"10310901\"]}");
	add("{\"term\":\"manama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08867560\"]}");
	add("{\"term\":\"manana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15288736\"]}");
	add("{\"term\":\"manannan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09533551\"]}");
	add("{\"term\":\"manat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13721852\", \"13724945\"]}");
	add("{\"term\":\"manatee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02076483\"]}");
	add("{\"term\":\"manawydan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09533659\"]}");
	add("{\"term\":\"manawyddan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09533659\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }