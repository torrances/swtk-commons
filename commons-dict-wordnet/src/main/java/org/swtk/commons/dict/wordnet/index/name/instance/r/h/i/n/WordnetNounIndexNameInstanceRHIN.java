package org.swtk.commons.dict.wordnet.index.name.instance.r.h.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRHIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rhincodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01490555\"]}");
	add("{\"term\":\"rhincodontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01490384\"]}");
	add("{\"term\":\"rhine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09431418\", \"11278914\"]}");
	add("{\"term\":\"rhineland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08793130\"]}");
	add("{\"term\":\"rhinencephalon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05485338\"]}");
	add("{\"term\":\"rhinestone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14718614\"]}");
	add("{\"term\":\"rhinion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05242547\"]}");
	add("{\"term\":\"rhinitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14378465\"]}");
	add("{\"term\":\"rhino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02394646\"]}");
	add("{\"term\":\"rhinobatidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01500220\"]}");
	add("{\"term\":\"rhinoceros\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02394646\"]}");
	add("{\"term\":\"rhinocerotidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02394434\"]}");
	add("{\"term\":\"rhinolaryngologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10079131\"]}");
	add("{\"term\":\"rhinolaryngology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06072392\"]}");
	add("{\"term\":\"rhinolophidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02145945\"]}");
	add("{\"term\":\"rhinonicteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02146762\"]}");
	add("{\"term\":\"rhinopathy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14420294\"]}");
	add("{\"term\":\"rhinophyma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14420444\"]}");
	add("{\"term\":\"rhinoplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00690315\"]}");
	add("{\"term\":\"rhinoptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01502236\"]}");
	add("{\"term\":\"rhinorrhea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14590715\"]}");
	add("{\"term\":\"rhinoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04094049\"]}");
	add("{\"term\":\"rhinoscopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00645015\"]}");
	add("{\"term\":\"rhinosporidiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14590862\"]}");
	add("{\"term\":\"rhinostenosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14130731\"]}");
	add("{\"term\":\"rhinotermitidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02226793\"]}");
	add("{\"term\":\"rhinotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00692443\"]}");
	add("{\"term\":\"rhinotracheitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14295525\"]}");
	add("{\"term\":\"rhinovirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01341178\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }