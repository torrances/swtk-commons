package org.swtk.commons.dict.wordnet.indexbyname.instance.r.u.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rule\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"04125870\", \"05855459\", \"05882839\", \"06664809\", \"06801754\", \"14466399\", \"15320659\", \"05922132\", \"07274440\", \"06664987\", \"05675457\", \"05854581\"]}");
	add("{\"term\":\"rule book\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07970797\"]}");
	add("{\"term\":\"rule of cy pres\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05857218\"]}");
	add("{\"term\":\"rule of evidence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06666108\"]}");
	add("{\"term\":\"rule of grammar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07274843\"]}");
	add("{\"term\":\"rule of law\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13992420\"]}");
	add("{\"term\":\"rule of morphology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07275161\"]}");
	add("{\"term\":\"rule of thumb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05857068\"]}");
	add("{\"term\":\"ruler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04125870\", \"10560786\"]}");
	add("{\"term\":\"rulership\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00600349\"]}");
	add("{\"term\":\"rules of order\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06665623\"]}");
	add("{\"term\":\"ruling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01193648\"]}");
	add("{\"term\":\"ruling class\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08404537\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }