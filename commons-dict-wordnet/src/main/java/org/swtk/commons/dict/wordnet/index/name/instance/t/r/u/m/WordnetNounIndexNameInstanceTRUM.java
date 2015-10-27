package org.swtk.commons.dict.wordnet.index.name.instance.t.r.u.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRUM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"truman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11369734\"]}");
	add("{\"term\":\"trumbo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11370054\"]}");
	add("{\"term\":\"trumbull\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11370281\", \"11370388\", \"11370509\"]}");
	add("{\"term\":\"trump\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03115320\", \"04498154\", \"04498430\"]}");
	add("{\"term\":\"trumpery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03381284\", \"06624351\"]}");
	add("{\"term\":\"trumpet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03115320\"]}");
	add("{\"term\":\"trumpeter\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01862643\", \"02023704\", \"10190891\", \"10751667\"]}");
	add("{\"term\":\"trumpetfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01460493\"]}");
	add("{\"term\":\"trumpets\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12801323\"]}");
	add("{\"term\":\"trumpetwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12425234\"]}");
	add("{\"term\":\"trumping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01262060\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }