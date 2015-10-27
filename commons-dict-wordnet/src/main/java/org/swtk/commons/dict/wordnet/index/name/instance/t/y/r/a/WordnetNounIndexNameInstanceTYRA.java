package org.swtk.commons.dict.wordnet.index.name.instance.t.y.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTYRA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tyramine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15107091\"]}");
	add("{\"term\":\"tyranni\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01549301\"]}");
	add("{\"term\":\"tyrannicide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01253258\"]}");
	add("{\"term\":\"tyrannid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01549562\"]}");
	add("{\"term\":\"tyrannidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01550100\"]}");
	add("{\"term\":\"tyrannosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01716405\"]}");
	add("{\"term\":\"tyrannosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01716405\"]}");
	add("{\"term\":\"tyrannus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01550784\"]}");
	add("{\"term\":\"tyranny\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14467378\", \"08457622\"]}");
	add("{\"term\":\"tyrant\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10755221\", \"10755364\", \"10754955\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }