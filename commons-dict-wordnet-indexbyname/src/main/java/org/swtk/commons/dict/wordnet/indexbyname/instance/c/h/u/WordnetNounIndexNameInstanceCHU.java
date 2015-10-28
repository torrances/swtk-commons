package org.swtk.commons.dict.wordnet.indexbyname.instance.c.h.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chub\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01443913\"]}");
	add("{\"term\":\"chubbiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05008254\"]}");
	add("{\"term\":\"chuck\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03030933\", \"07672061\", \"07580726\"]}");
	add("{\"term\":\"chuckhole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09420951\"]}");
	add("{\"term\":\"chuckle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07142271\"]}");
	add("{\"term\":\"chuckwalla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01680984\"]}");
	add("{\"term\":\"chuddar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03002448\"]}");
	add("{\"term\":\"chufa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12171486\"]}");
	add("{\"term\":\"chug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07394452\"]}");
	add("{\"term\":\"chukchi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06941011\", \"09940749\"]}");
	add("{\"term\":\"chukka\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03031308\", \"15280452\"]}");
	add("{\"term\":\"chukker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15280452\"]}");
	add("{\"term\":\"chum\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02539316\", \"03031480\", \"09897417\"]}");
	add("{\"term\":\"chumminess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04660984\"]}");
	add("{\"term\":\"chump\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09940867\"]}");
	add("{\"term\":\"chunga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02017178\"]}");
	add("{\"term\":\"chungking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08742994\"]}");
	add("{\"term\":\"chunk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13780337\", \"07977630\"]}");
	add("{\"term\":\"chunking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05739513\"]}");
	add("{\"term\":\"chunnel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03031618\"]}");
	add("{\"term\":\"church\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08099776\", \"01034400\", \"03031762\", \"08099479\"]}");
	add("{\"term\":\"churchgoer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09941943\"]}");
	add("{\"term\":\"churchill\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08843315\", \"10917064\", \"10917346\"]}");
	add("{\"term\":\"churchman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09947594\"]}");
	add("{\"term\":\"churchwarden\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09942117\"]}");
	add("{\"term\":\"churchyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08664929\"]}");
	add("{\"term\":\"churidars\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03032979\"]}");
	add("{\"term\":\"churl\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10167825\", \"10377436\", \"10430560\"]}");
	add("{\"term\":\"churn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03033147\"]}");
	add("{\"term\":\"chute\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03033305\", \"03893954\"]}");
	add("{\"term\":\"chutney\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07839081\"]}");
	add("{\"term\":\"chutzpa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04923377\"]}");
	add("{\"term\":\"chutzpah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04923377\"]}");
	add("{\"term\":\"chutzpanik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09941131\"]}");
	add("{\"term\":\"chuvash\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06940729\", \"09755086\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }