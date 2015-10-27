package org.swtk.commons.dict.wordnet.index.name.instance.s.t.e.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTEI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"steichen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11334509\"]}");
	add("{\"term\":\"stein\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11334661\", \"02827200\"]}");
	add("{\"term\":\"steinbeck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11334787\"]}");
	add("{\"term\":\"steinberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11334964\"]}");
	add("{\"term\":\"steinbok\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02429127\"]}");
	add("{\"term\":\"steinem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11335135\"]}");
	add("{\"term\":\"steiner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11335244\"]}");
	add("{\"term\":\"steinman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11335374\"]}");
	add("{\"term\":\"steinmetz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11335575\"]}");
	add("{\"term\":\"steinway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11335755\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }