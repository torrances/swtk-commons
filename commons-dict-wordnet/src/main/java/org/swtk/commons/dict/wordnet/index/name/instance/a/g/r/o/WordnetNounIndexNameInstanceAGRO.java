package org.swtk.commons.dict.wordnet.index.name.instance.a.g.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAGRO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"agrobacterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01357162\"]}");
	add("{\"term\":\"agrobiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06075622\"]}");
	add("{\"term\":\"agrology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06075817\"]}");
	add("{\"term\":\"agromania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09204786\"]}");
	add("{\"term\":\"agronomist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09799561\"]}");
	add("{\"term\":\"agronomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06075369\"]}");
	add("{\"term\":\"agropyron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12125460\"]}");
	add("{\"term\":\"agrostemma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11825849\"]}");
	add("{\"term\":\"agrostis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12127057\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }