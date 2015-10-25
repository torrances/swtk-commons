package org.swtk.commons.dict.wiktionary.generated.h.u.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHUB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hubbard", "{\"term\":\"hubbard\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A city in Iow\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A village in Nebrask\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A city in Ohi\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A city in Orego\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A village in Saskatchewa\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A city in Texa\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"One of two towns in Wisconsin\", \"priority\":7}]}, \"synonyms\":{}}");

	add("hubbub", "{\"term\":\"hubbub\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Perhaps from Irish; compare Irish \u0027ababú!\u0027 (a battle-cry), Gaelic \u0027ub|ub! ub!\u0027 (expressing contempt, etc.), \u0027ubh ubh!\u0027 (expressing disgust).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A confused uproar, commotion, tumult or racket\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"John Milton, \u0027 Paradise Lost\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"At length a universal \u0027\u0027hubbub\u0027\u0027 wil\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Of stunning sounds and voices all confused\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Borne through the hollow dark, assaults his ea\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"With loudest vehemence\", \"priority\":6}]}, \"synonyms\":{}}");

	add("hubeite", "{\"term\":\"hubeite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027-ite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A triclinic-pinacoidal mineral containing aluminum, calcium, hydrogen, iron, manganese, oxygen, and silicon\", \"priority\":1}]}, \"synonyms\":{}}");

	add("huboon", "{\"term\":\"huboon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|human|baboon|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A human-baboon hybrid; an ape-like person\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"c. 1976:\u0027\u0027 Devo, \u0027Huboon Stomp\u0027 (song\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I\u0027m a \u0027\u0027huboon\u0027\u0027, baby, I\u0027m a cross between a human and an ap\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"c. 1976:\u0027\u0027 Devo, \u0027Soo Bawlz\u0027 (song\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"She\u0027s got all the \u0027\u0027huboons\u0027\u0027 crying her nam\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1994:\u0027\u0027 Joseph S. Berliner, \u0026quot;Transformation as Transplanation\u0026quot;, in \u0027A World Fit For People\u0027, p. 88\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Your first giddy reaction would be to wonder whether the patient, if he survived at all, would still be human being, [sic] or rather a baboon, or perhaps an entirely new hybrid species, no doubt to be called a \u0026quot;\u0027\u0027huboon\u0027\u0027.\u0026quot\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2004:\u0027\u0027 \u0026quot;Mr. X\u0026quot;, \u0027Shout It Out\u0027, Club Devo [http://www.clubdevo.com/mp/shout.html\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Everything that \u0027makes the world go round\u0027, or \u0027progress with a price tag\u0027 as the \u0027\u0027huboons\u0027\u0027 say on their way to work\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }