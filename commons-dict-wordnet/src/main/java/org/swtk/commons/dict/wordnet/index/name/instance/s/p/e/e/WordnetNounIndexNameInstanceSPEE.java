package org.swtk.commons.dict.wordnet.index.name.instance.s.p.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPEE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"speech\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"05658665\", \"07023937\", \"06726869\", \"07085523\", \"07125165\", \"07144758\", \"07123904\", \"07253354\"]}");
	add("{\"term\":\"speechifier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10400371\"]}");
	add("{\"term\":\"speechlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04989994\"]}");
	add("{\"term\":\"speechmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10400371\"]}");
	add("{\"term\":\"speechmaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07256497\"]}");
	add("{\"term\":\"speechwriter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10651016\"]}");
	add("{\"term\":\"speed\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02707012\", \"13843620\", \"00330986\", \"05065291\", \"15307914\"]}");
	add("{\"term\":\"speedboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04280688\"]}");
	add("{\"term\":\"speeder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10653994\"]}");
	add("{\"term\":\"speediness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05066283\"]}");
	add("{\"term\":\"speeding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00330986\"]}");
	add("{\"term\":\"speedometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04280915\"]}");
	add("{\"term\":\"speedskater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10654247\"]}");
	add("{\"term\":\"speedup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00331283\"]}");
	add("{\"term\":\"speedway\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04281229\", \"04281333\"]}");
	add("{\"term\":\"speedwell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12911025\"]}");
	add("{\"term\":\"speer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11329953\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }