package org.swtk.commons.dict.wordnet.index.name.instance.c.h.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chiralgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14349385\"]}");
	add("{\"term\":\"chirico\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10916007\"]}");
	add("{\"term\":\"chirocephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01997977\"]}");
	add("{\"term\":\"chirography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06415612\"]}");
	add("{\"term\":\"chirology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05785827\"]}");
	add("{\"term\":\"chiromancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10414908\"]}");
	add("{\"term\":\"chiromancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05785827\"]}");
	add("{\"term\":\"chiron\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09266928\", \"09516938\"]}");
	add("{\"term\":\"chironomidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02205660\"]}");
	add("{\"term\":\"chironomus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02205984\"]}");
	add("{\"term\":\"chiropodist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09938755\"]}");
	add("{\"term\":\"chiropody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06071626\"]}");
	add("{\"term\":\"chiropractic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00709220\"]}");
	add("{\"term\":\"chiropractor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09938658\"]}");
	add("{\"term\":\"chiroptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02141573\"]}");
	add("{\"term\":\"chiropteran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02141851\"]}");
	add("{\"term\":\"chirp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07394009\"]}");
	add("{\"term\":\"chirpiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04639420\"]}");
	add("{\"term\":\"chirrup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07394177\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }