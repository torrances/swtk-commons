package org.swtk.commons.dict.wordnet.index.name.instance.d.e.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDECO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"deco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08482129\"]}");
	add("{\"term\":\"decoagulant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02721170\"]}");
	add("{\"term\":\"decoction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13478838\"]}");
	add("{\"term\":\"decoder\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03173729\", \"10014936\"]}");
	add("{\"term\":\"decoding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00618299\"]}");
	add("{\"term\":\"decolletage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03173842\"]}");
	add("{\"term\":\"decolonisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01084472\"]}");
	add("{\"term\":\"decolonization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01084472\"]}");
	add("{\"term\":\"decomposition\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"11464739\", \"13479192\", \"13479471\", \"14584919\", \"06022820\"]}");
	add("{\"term\":\"decompressing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00358277\"]}");
	add("{\"term\":\"decompression\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00358277\", \"00617881\"]}");
	add("{\"term\":\"decongestant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03173937\"]}");
	add("{\"term\":\"deconstruction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05978879\"]}");
	add("{\"term\":\"deconstructionism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05978879\"]}");
	add("{\"term\":\"deconstructivism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08292625\"]}");
	add("{\"term\":\"decontamination\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00395293\"]}");
	add("{\"term\":\"decor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03584524\"]}");
	add("{\"term\":\"decoration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00263092\", \"06719615\", \"03174056\"]}");
	add("{\"term\":\"decorativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04707675\"]}");
	add("{\"term\":\"decorator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10018427\", \"10230422\"]}");
	add("{\"term\":\"decorousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04905981\"]}");
	add("{\"term\":\"decortication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00671348\"]}");
	add("{\"term\":\"decorum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04905981\"]}");
	add("{\"term\":\"decoupage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00937601\", \"03174958\"]}");
	add("{\"term\":\"decoy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02779210\", \"10015111\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }