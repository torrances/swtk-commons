package org.swtk.commons.dict.wordnet.index.name.instance.t.r.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTROO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"troop\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08291486\", \"08291639\", \"08291364\", \"08291275\"]}");
	add("{\"term\":\"trooper\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09921806\", \"10750385\", \"10750194\", \"09922064\"]}");
	add("{\"term\":\"troops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08414212\"]}");
	add("{\"term\":\"troopship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04495150\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }