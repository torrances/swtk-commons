package org.swtk.commons.dict.wiktionary.generated.d.a.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDAG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dagestan", "{\"term\":\"dagestan\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Persian\"], \"text\":\"Derived from {{m|tr|dağ||mountain}} and the Persian suffix \u0027-stan\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Russian republic in the Caucasus region\", \"priority\":1}]}, \"synonyms\":{}}");

	add("daglock", "{\"term\":\"daglock\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|dag|lock|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dirty or clotted lock of wool on a sheep\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Wedgwoo\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Daglocks\u0027\u0027, clotted locks hanging in dags or jags at a sheep\u0027s tail\", \"priority\":3}]}, \"synonyms\":{}}");

	add("dagmar", "{\"term\":\"dagmar\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Name of a queen of Denmark (1185-1212), originally Dragomira, from Slavonic \u0027dorog\u0027\u0026quot;dear\u0026quot; + \u0027meri\u0027 \u0026quot;famous\u0026quot;, rendered into medieval Danish to sound like \u0027dag\u0027 \u0026quot;day\u0026quot; + \u0027már\u0027 \u0026quot;maid\u0026quot;.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"of origin, in occasional use since the end of the 19th century\", \"priority\":1}]}, \"synonyms\":{}}");

	add("daguerreotyper", "{\"term\":\"daguerreotyper\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|daguerreotype|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who takes daguerreotypes\", \"priority\":1}]}, \"synonyms\":{}}");

	add("daguerreotypy", "{\"term\":\"daguerreotypy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The art or technique of producing daguerreotypes\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }