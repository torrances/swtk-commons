package org.swtk.commons.dict.wordnet.indexbyname.instance.r.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rot\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06624034\", \"13479192\", \"14584518\"]}");
	add("{\"term\":\"rota\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06508853\", \"08352341\"]}");
	add("{\"term\":\"rotarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10559173\"]}");
	add("{\"term\":\"rotary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04382492\", \"04473168\"]}");
	add("{\"term\":\"rotation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05052532\", \"07455579\", \"13807769\", \"00342854\"]}");
	add("{\"term\":\"rotavirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01343731\"]}");
	add("{\"term\":\"rotc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08229841\"]}");
	add("{\"term\":\"rote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05763390\"]}");
	add("{\"term\":\"rotenone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15037045\"]}");
	add("{\"term\":\"rotgut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07938752\"]}");
	add("{\"term\":\"roth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11292020\"]}");
	add("{\"term\":\"rothko\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11292188\"]}");
	add("{\"term\":\"rothschild\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11292405\"]}");
	add("{\"term\":\"rotifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01931827\"]}");
	add("{\"term\":\"rotifera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01931688\"]}");
	add("{\"term\":\"rotisserie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04118508\", \"04118625\"]}");
	add("{\"term\":\"rotl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13741051\"]}");
	add("{\"term\":\"rotogravure\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01105397\", \"06277626\", \"06692053\"]}");
	add("{\"term\":\"rotor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04118762\", \"04119241\", \"04119056\"]}");
	add("{\"term\":\"rottenness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04798804\", \"14584694\"]}");
	add("{\"term\":\"rottenstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14960612\"]}");
	add("{\"term\":\"rotter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10559272\"]}");
	add("{\"term\":\"rotterdam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08970680\"]}");
	add("{\"term\":\"rotting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13479192\"]}");
	add("{\"term\":\"rottweiler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02109202\"]}");
	add("{\"term\":\"rotunda\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04119673\", \"04119748\"]}");
	add("{\"term\":\"rotundity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07097164\", \"05080300\"]}");
	add("{\"term\":\"rotundness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05080300\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }