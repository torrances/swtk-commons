package org.swtk.commons.dict.wordnet.index.name.instance.d.e.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"destabilisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01161948\"]}");
	add("{\"term\":\"destabilization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01161948\", \"07371089\"]}");
	add("{\"term\":\"destalinisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13484859\"]}");
	add("{\"term\":\"destalinization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13484859\"]}");
	add("{\"term\":\"destination\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06800007\", \"05990653\", \"08585406\"]}");
	add("{\"term\":\"destiny\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14496806\", \"09528047\", \"07344607\"]}");
	add("{\"term\":\"destitution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14517197\"]}");
	add("{\"term\":\"destroyer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10028370\", \"03185170\"]}");
	add("{\"term\":\"destructibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05050613\"]}");
	add("{\"term\":\"destruction\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14586552\", \"07349090\", \"00217881\"]}");
	add("{\"term\":\"destructiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05173431\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }