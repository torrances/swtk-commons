package org.swtk.commons.dict.wordnet.index.name.instance.m.a.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMATR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"matriarch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10322367\", \"10322243\"]}");
	add("{\"term\":\"matriarchate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07989335\"]}");
	add("{\"term\":\"matriarchy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07989335\"]}");
	add("{\"term\":\"matric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01251155\"]}");
	add("{\"term\":\"matricaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12015296\"]}");
	add("{\"term\":\"matricide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00222686\", \"10322483\"]}");
	add("{\"term\":\"matriculate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10322572\"]}");
	add("{\"term\":\"matriculation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01251155\"]}");
	add("{\"term\":\"matrikin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10256218\"]}");
	add("{\"term\":\"matrilineage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13836967\"]}");
	add("{\"term\":\"matrimony\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01038935\", \"13987306\"]}");
	add("{\"term\":\"matrisib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10256218\"]}");
	add("{\"term\":\"matrix\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03736146\", \"05589841\", \"05589955\", \"09371952\", \"14973365\", \"08284561\"]}");
	add("{\"term\":\"matron\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10322853\", \"10322977\", \"10322704\"]}");
	add("{\"term\":\"matronymic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06347519\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }