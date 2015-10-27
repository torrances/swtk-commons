package org.swtk.commons.dict.wordnet.index.name.instance.s.o.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"soma\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05224424\", \"09552205\", \"13258886\"]}");
	add("{\"term\":\"somaesthesia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05667701\", \"05729127\"]}");
	add("{\"term\":\"somaesthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05667701\"]}");
	add("{\"term\":\"somali\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07003664\", \"09769211\"]}");
	add("{\"term\":\"somalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09020930\"]}");
	add("{\"term\":\"somalian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09769211\"]}");
	add("{\"term\":\"soman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15080939\"]}");
	add("{\"term\":\"somataesthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05667701\"]}");
	add("{\"term\":\"somateria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01855713\"]}");
	add("{\"term\":\"somatesthesia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05667701\", \"05729127\"]}");
	add("{\"term\":\"somatosense\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05662718\"]}");
	add("{\"term\":\"somatotrophin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05419992\"]}");
	add("{\"term\":\"somatotropin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05419992\"]}");
	add("{\"term\":\"somatotype\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05006131\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }