package org.swtk.commons.dict.wordnet.index.name.instance.r.i.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRING {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ring\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"02788214\", \"04099721\", \"04100053\", \"07406463\", \"08260983\", \"09269789\", \"03539152\", \"13898031\", \"04988907\"]}");
	add("{\"term\":\"ringdove\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01815729\", \"01816299\"]}");
	add("{\"term\":\"ringer\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00107546\", \"10551002\", \"10551114\", \"10734500\"]}");
	add("{\"term\":\"ringgit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13720181\"]}");
	add("{\"term\":\"ringhals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01751885\"]}");
	add("{\"term\":\"ringing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04996893\", \"07243191\", \"07406463\"]}");
	add("{\"term\":\"ringleader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10551395\"]}");
	add("{\"term\":\"ringlet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02280394\", \"04100251\", \"05265220\", \"13898609\"]}");
	add("{\"term\":\"ringling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11283170\"]}");
	add("{\"term\":\"ringmaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10551505\"]}");
	add("{\"term\":\"rings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04100317\"]}");
	add("{\"term\":\"ringside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04100572\"]}");
	add("{\"term\":\"ringtail\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01617331\", \"02494666\", \"02510844\", \"02511373\"]}");
	add("{\"term\":\"ringway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02831832\"]}");
	add("{\"term\":\"ringworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14148948\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }