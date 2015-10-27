package org.swtk.commons.dict.wordnet.index.name.instance.e.i.g.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEIGH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eight\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03272251\", \"08292418\", \"13767226\"]}");
	add("{\"term\":\"eighteen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13770005\"]}");
	add("{\"term\":\"eighteenth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13870881\"]}");
	add("{\"term\":\"eighter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13767226\"]}");
	add("{\"term\":\"eighth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13760280\", \"13869813\"]}");
	add("{\"term\":\"eighties\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"15175830\", \"15175953\", \"15176044\"]}");
	add("{\"term\":\"eightieth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13871709\"]}");
	add("{\"term\":\"eightpence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13412783\"]}");
	add("{\"term\":\"eightsome\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00541433\", \"08004345\"]}");
	add("{\"term\":\"eightvo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05103670\"]}");
	add("{\"term\":\"eighty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13772304\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }