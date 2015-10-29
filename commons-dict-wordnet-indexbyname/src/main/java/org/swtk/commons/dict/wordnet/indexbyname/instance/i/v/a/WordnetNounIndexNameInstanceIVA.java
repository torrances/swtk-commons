package org.swtk.commons.dict.wordnet.indexbyname.instance.i.v.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceIVA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"iva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12005522\"]}");
	add("{\"term\":\"iva xanthifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12005790\"]}");
	add("{\"term\":\"ivan iii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11095011\"]}");
	add("{\"term\":\"ivan iii vasilievich\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11095011\"]}");
	add("{\"term\":\"ivan iv\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11095209\"]}");
	add("{\"term\":\"ivan iv vasilievich\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11095209\"]}");
	add("{\"term\":\"ivan lendl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11146071\"]}");
	add("{\"term\":\"ivan pavlov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11247196\"]}");
	add("{\"term\":\"ivan petrovich pavlov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11247196\"]}");
	add("{\"term\":\"ivan sergeevich turgenev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11372030\"]}");
	add("{\"term\":\"ivan the great\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11095011\"]}");
	add("{\"term\":\"ivan the terrible\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11095209\"]}");
	add("{\"term\":\"ivan turgenev\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11372030\"]}");
	add("{\"term\":\"ivanov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11095342\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }