package org.swtk.commons.dict.wordnet.indexbyname.instance.o.t.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOTO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oto\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06921966\", \"09684000\"]}");
	add("{\"term\":\"otoe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06921966\", \"09684000\"]}");
	add("{\"term\":\"otoganglion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05304862\"]}");
	add("{\"term\":\"otolaryngologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10079131\"]}");
	add("{\"term\":\"otolaryngology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06072392\"]}");
	add("{\"term\":\"otologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10061003\"]}");
	add("{\"term\":\"otology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06064231\"]}");
	add("{\"term\":\"otoplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00683878\"]}");
	add("{\"term\":\"otorhinolaryngologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10079131\"]}");
	add("{\"term\":\"otorhinolaryngology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06072392\"]}");
	add("{\"term\":\"otorrhea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14375482\"]}");
	add("{\"term\":\"otosclerosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14184385\"]}");
	add("{\"term\":\"otoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03863703\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }