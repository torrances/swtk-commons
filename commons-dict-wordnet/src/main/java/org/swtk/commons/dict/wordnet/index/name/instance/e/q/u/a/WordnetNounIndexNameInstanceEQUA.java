package org.swtk.commons.dict.wordnet.index.name.instance.e.q.u.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEQUA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"equal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09649426\"]}");
	add("{\"term\":\"equalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00045411\"]}");
	add("{\"term\":\"equaliser\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03123190\", \"03298652\"]}");
	add("{\"term\":\"equalitarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10066678\"]}");
	add("{\"term\":\"equalitarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05976455\"]}");
	add("{\"term\":\"equality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13969940\", \"04755139\"]}");
	add("{\"term\":\"equalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00045411\"]}");
	add("{\"term\":\"equalizer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00484109\", \"03123190\", \"03298652\"]}");
	add("{\"term\":\"equanil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03753237\"]}");
	add("{\"term\":\"equanimity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04910990\"]}");
	add("{\"term\":\"equatability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04755427\"]}");
	add("{\"term\":\"equating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00186156\"]}");
	add("{\"term\":\"equation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00186156\", \"13969940\", \"06682609\"]}");
	add("{\"term\":\"equator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13896712\", \"08586248\"]}");
	add("{\"term\":\"equatorial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03298774\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }