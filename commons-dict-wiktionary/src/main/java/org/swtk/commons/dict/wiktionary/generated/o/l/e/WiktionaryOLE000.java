package org.swtk.commons.dict.wiktionary.generated.o.l.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOLE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oled", "{\"term\":\"oled\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"organic light-emitting diode\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oleamen", "{\"term\":\"oleamen\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"Latin \u0027oleum\u0027 (olive oil) probably via *\u0027oleamen\u0027 (\u0027-men\u0027 is an alternative neuter suffix).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A soft ointment prepared from oil\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oleander", "{\"term\":\"oleander\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a notoriously poisonous shrub in the dogbane family, Apocynaceae, but nonetheless widely grown as an ornamental\", \"priority\":1}]}, \"synonyms\":{}}");

	add("olecranon", "{\"term\":\"olecranon\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"A Greek compound of {{m|grc|ὠλένη||elbow}} and {{m|grc|κρανίον||head}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The bony process at the top of the ulna forming the point of the elbow\", \"priority\":1}]}, \"synonyms\":{}}");

	add("olema", "{\"term\":\"olema\", \"etymology\":{\"influencers\":[], \"languages\":[\"Estonian\"], \"text\":\"From {{inh|et|fiu-fin-pro|*oldak}}, from Proto-uralic {{m|urj-pro|*wole-}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1885\u0027\u0027, the land of Egypt was ruled by a Sultan endowed with justice and generosity, one who loved the pious poor and companied with the Olema and learned men — Sir Richard Burton, \u0027The Book of the Thousand Nights and a Night\u0027 (Night 20\", \"priority\":1}]}, \"synonyms\":{}}");

	add("olenekian", "{\"term\":\"olenekian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A subdivision of the Triassic period\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oleochemical", "{\"term\":\"oleochemical\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|oleo|chemical|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any organic compound derived from a natural vegetable oil or animal fat\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }